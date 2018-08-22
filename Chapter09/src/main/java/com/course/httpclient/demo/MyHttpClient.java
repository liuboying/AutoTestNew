package com.course.httpclient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyHttpClient {

    @Test
    public void test1() throws IOException {

        //存储返回的结果
        String result;
        HttpGet get = new HttpGet("http://www.baidu.com");
        //用于执行get
        HttpClient client = new DefaultHttpClient();

        //执行get
        HttpResponse httpResponse = client.execute(get);

        //获取返回，并将返回转化为String
        result = EntityUtils.toString(httpResponse.getEntity(),"utf-8");
        System.out.println(result);

    }
}
