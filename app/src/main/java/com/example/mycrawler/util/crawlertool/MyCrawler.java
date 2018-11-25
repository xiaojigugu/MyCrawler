package com.example.mycrawler.util.crawlertool;

import android.os.Handler;
import android.os.Message;


import com.example.mycrawler.util.link.LinkFilter;
import com.example.mycrawler.util.link.Links;
import com.example.mycrawler.util.page.Page;
import com.example.mycrawler.util.page.PageParserTool;
import com.example.mycrawler.util.page.RequestAndResponseTool;

import org.jsoup.select.Elements;

import java.util.Set;

public class MyCrawler {
    private static String visitUrl;

    private void test() {
        crawling(new String[]{"http://www.biquge.com.tw/"});
    }

    /**
     * 使用种子初始化 URL 队列
     *
     * @param seeds 种子 URL
     * @return
     */
    private void initCrawlerWithSeeds(String[] seeds) {
        for (int i = 0; i < seeds.length; i++) {
            Links.addUnvisitedUrlQueue(seeds[i]);
        }
    }

    /**
     * 抓取过程
     *
     * @param seeds
     * @return
     */
    public void crawling(String[] seeds) {

        //初始化 URL 队列
        initCrawlerWithSeeds(seeds);

        //定义过滤器，提取以 https://www.baidu.com 开头的链接
        LinkFilter filter = new LinkFilter() {
            public boolean accept(String url) {
                if (url.startsWith("http://www.biquge.com.tw/"))
                    return true;
                else
                    return false;
            }
        };

        //循环条件：待抓取的链接不空且抓取的网页不多于 1000
        while (!Links.unVisitedUrlQueueIsEmpty() && Links.getVisitedUrlNum() <= 1000) {

            //先从待访问的序列中取出第一个；
            visitUrl = (String) Links.removeHeadOfUnVisitedUrlQueue();
            if (visitUrl == null) {
                continue;
            }

            //根据URL得到page;
            RequestAndResponseTool.sendRequestAndGetResponse(visitUrl, new Handler());
        }
    }

    static class MyHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 1:
                    //对page进行处理： 访问DOM的某个标签
                    Elements es = PageParserTool.select((Page) msg.obj, "a");
                    if (!es.isEmpty()) {
                        System.out.println("下面将打印所有a标签： ");
                        System.out.println(es);
                    }

                    //将保存文件
                    FileTool.saveToLocal((Page) msg.obj);

                    //将已经访问过的链接放入已访问的链接中；
                    Links.addVisitedUrlSet(visitUrl);

                    //得到超链接
                    Set<String> links = PageParserTool.getLinks((Page) msg.obj, "img");
                    for (String link : links) {
                        Links.addUnvisitedUrlQueue(link);
                        System.out.println("新增爬取路径: " + link);
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
