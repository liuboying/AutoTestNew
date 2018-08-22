package com.course.httpclient.getcookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.http.client.HttpClient;

import java.io.IOException;
import java.util.ResourceBundle;

public class MyCookies {

    private String url;
    private ResourceBundle bundle;

    @BeforeTest
    public void beforeTest() {
        bundle = ResourceBundle.getBundle("application");
        url = bundle.getString("test.url");

    }

    @Test
    public void testGetCookies() throws Exception{
        //HttpClient client = new HttpClient(this.t)
        String uri = bundle.getString("getCookies.uri");
        String testURL = this.url + uri;
        System.out.println(testURL);

        HttpGet get = new HttpGet(testURL);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);

        String result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }
}
