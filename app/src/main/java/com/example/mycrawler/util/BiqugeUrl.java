package com.example.mycrawler.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class BiqugeUrl {
    private String host = "https://quapp.1122dh.com";
    public String sex = "man"; //man lady

    public String image = "https://imgapi.jiaston.com/BookFiles/BookImages/";

    public String login = host + "/Login.aspx";//username=13861083420 password=554677475 action=login
    public String bookshelf = host + "/Bookshelf.aspx";//个人书架

    //首页-顶部轮播banner
    public String banner = host + "/v5/base/banner_man.html";
    //首页-火热新书
    public String hotNew = host + "/v5/base/man.html";
    //新书榜单
    public String topNewWeek = host + "/top/" + sex + "/top/new/week/1.html";//周榜
    public String topNewMonth = host + "/top/" + sex + "/top/new/Month/1.html";//月榜
    public String topNewTotal = host + "/top/" + sex + "/top/new/total/1.html";//总榜

    //分类
    public String category = host + "/BookCategory.html";
    //分类-玄幻奇幻
    public String category1Hot = host + "/Categories/1/hot/1.html";//最热
    public String category1New = host + "/Categories/1/new/1.html";//最新
    public String category1Vote = host + "/Categories/1/vote/1.html";//评分
    public String category1Over = host + "/Categories/1/over/1.html";//完结
    //分类-武侠仙侠
    public String category2Hot = host + "/Categories/2/hot/1.html";//最热
    public String category2New = host + "/Categories/2/new/1.html";//最新
    public String category2Vote = host + "/Categories/2/vote/1.html";//评分
    public String category2Over = host + "/Categories/2/over/1.html";//完结
    //分类-都市言情
    public String category3Hot = host + "/Categories/3/hot/1.html";//最热
    public String category3New = host + "/Categories/3/new/1.html";//最新
    public String category3Vote = host + "/Categories/3/vote/1.html";//评分
    public String category3Over = host + "/Categories/3/over/1.html";//完结
    //分类-历史军事
    public String category4Hot = host + "/Categories/4/hot/1.html";//最热
    public String category4New = host + "/Categories/4/new/1.html";//最新
    public String category4Vote = host + "/Categories/4/vote/1.html";//评分
    public String category4Over = host + "/Categories/4/over/1.html";//完结
    //分类-科幻灵异
    public String category5Hot = host + "/Categories/5/hot/1.html";//最热
    public String category5New = host + "/Categories/5/new/1.html";//最新
    public String category5Vote = host + "/Categories/5/vote/1.html";//评分
    public String category5Over = host + "/Categories/5/over/1.html";//完结
    //分类-网游竞技
    public String category6Hot = host + "/Categories/6/hot/1.html";//最热
    public String category6New = host + "/Categories/6/new/1.html";//最新
    public String category6Vote = host + "/Categories/6/vote/1.html";//评分
    public String category6Over = host + "/Categories/6/over/1.html";//完结
    //分类-女生频道
    public String category7Hot = host + "/Categories/7/hot/1.html";//最热
    public String category7New = host + "/Categories/7/new/1.html";//最新
    public String category7Vote = host + "/Categories/7/vote/1.html";//评分
    public String category7Over = host + "/Categories/7/over/1.html";//完结
    //分类-同人小说
    public String category8Hot = host + "/Categories/8/hot/1.html";//最热
    public String category8New = host + "/Categories/8/new/1.html";//最新
    public String category8Vote = host + "/Categories/8/vote/1.html";//评分
    public String category8Over = host + "/Categories/8/over/1.html";//完结

    //书单
    public String shudanNew = host + "/shudan/man/all/new/1.html";//最新发布
    public String shudanHot = host + "/shudan/man/all/hot/1.html";//本周最热
    public String shudanCollect = host + "/shudan/man/all/collect/1.html";//最多收藏
    public String shudanCommend = host + "/shudan/man/all/commend/1.html";//小编推荐

    //推荐榜
    public String topWeek = host + "/top/" + sex + "/top/commend/week/1.html";//周榜
    public String topMonth = host + "/top/" + sex + "/top/commend/month/1.html";//月榜
    public String totalWeek = host + "/top/" + sex + "/top/commend/total/1.html";//总榜

    //收藏榜
    public String collectWeek = host + "/top/" + sex + "/top/collect/week/1.html";//周榜
    public String collectMonth = host + "/top/" + sex + "/top/collect/month/1.html";//月榜
    public String collectTotal = host + "/top/" + sex + "/top/collect/total/1.html";//总榜

    //评分榜
    public String voteWeek = host + "/top/" + sex + "/top/collect/week/1.html";//周榜
    public String voteMonth = host + "/top/" + sex + "/top/collect/month/1.html";//月榜
    public String voteTotal = host + "/top/" + sex + "/top/collect/total/1.html";//总榜

    //完结榜
    public String overWeek = host + "/top/" + sex + "/top/collect/week/1.html";//周榜
    public String overMonth = host + "/top/" + sex + "/top/collect/month/1.html";//月榜
    public String overTotal = host + "/top/" + sex + "/top/collect/total/1.html";//总榜

    //热更榜
    public String hotWeek = host + "/top/" + sex + "/top/collect/week/1.html";//周榜
    public String hotMonth = host + "/top/" + sex + "/top/collect/month/1.html";//月榜
    public String hotTotal = host + "/top/" + sex + "/top/collect/total/1.html";//总榜

    //排行榜
    public String type = "hot";//最热-hot 推荐-commend 完结-over 收藏-collect 新书-new 评分-vote
    public String rankingType = "week";//week month total
    public String index = "1";
    public String rankingWeek = host + "/top/" + sex + "/top/" + type + "/week/1.html";//周榜
    public String getRanking() {
        return rankingWeek = host + "/top/" + sex + "/top/" + type + "/" + rankingType + "/" + index + ".html";//周榜
    }

    //搜索
    public String key;
    public String searchZhannei = "https://sou.jiaston.com/search.aspx?key=" + cnEncode(key) + "&page=1&siteid=app";//站内搜索
    public String searchZhuishu = "http://api02u58f.zhuishushenqi.com/book/fuzzy-search?query=" + cnEncode(key);//追书
    public String searchBaidu = "http://zhannei.baidu.com/cse/search?s=5541116575338011306&p=0&q=" + cnEncode(key);//百度
    public String searchYisou = "http://api.easou.com/api/bookapp/searchdzh.m?word=" + cnEncode(key) + "&page_id=1&count=20&cid=eef_&os=ios&appverion=1049";//宜搜

    public String id = "";//书本编号

    public void setId(String id) {
        this.id = id;
    }

    public String getBookInfo() {
        return host + "/info/" + id + ".html";//书籍详情页
    }

    public String getBookChapter() {
        return host + "/book/" + id + "/";//书籍章节列表
    }

    public String chapterId="";//章节编号
    public String getBookContent() {
        return host + "/book/" + id + "/"+chapterId+".html";//书籍章节内容
    }

    public String bookComment = host + "/v5/base/cysyquapp.html?id=" + id;//评论

    public String getBookComment() {
        return bookComment = host + "/v5/base/cysyquapp.html?id=" + id;
    }

    private String cnEncode(String cn) {
        if (cn != null) {
            char[] ch = cn.toCharArray();
            String result = "";
            for (int i = 0; i < ch.length; i++) {
                char temp = ch[i];
                if (isChinese(temp)) {
                    try {
                        String encode = URLEncoder.encode(String.valueOf(temp), "utf-8");
                        result = result + encode;
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                } else {
                    result = result + temp;
                }
            }
            return result;
        } else {
            return "";
        }
    }

    private boolean isChinese(char c) {
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION) {
            return true;
        }
        return false;
    }
}
