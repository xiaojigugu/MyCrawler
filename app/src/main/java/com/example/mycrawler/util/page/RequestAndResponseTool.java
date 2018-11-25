package com.example.mycrawler.util.page;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RequestAndResponseTool {

    private static Page page;

    public static void sendRequestAndGetResponse(final String url1, final Handler handler) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                byte[] buff = new byte[1024];
                int len;
                try {
                    URL url = new URL(url1);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setConnectTimeout(5000);
                    connection.setRequestMethod("GET");
                    connection.connect();
                    int code = connection.getResponseCode();
                    Log.e("code", " " + code);
                    if (code == 200) {
                        InputStream is = connection.getInputStream();
                        ByteArrayOutputStream os = new ByteArrayOutputStream();
                        while ((len = is.read(buff)) != -1) {
                            os.write(buff, 0, len);
                        }
                        byte[] responseBody = os.toByteArray();// 读取为字节 数组
                        String contentType = connection.getContentType(); // 得到当前返回类型
                        //封装成为页面
                        page = new Page(responseBody, url1, contentType);
                        Message message=new Message();
                        message.obj=page;
                        message.what=1;
                       handler.sendMessage(message);
                    }
                    // 6. 断开连接，释放资源
                    connection.disconnect();
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}