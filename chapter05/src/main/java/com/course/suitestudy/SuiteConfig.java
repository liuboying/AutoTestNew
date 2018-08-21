package com.course.suitestudy;

import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("\nBeforeSuite运行了~~~~");

    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite运行了！！！！");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod");//为啥没运行到这？
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod");//为啥没运行到这？
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");//为啥没运行到这？
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass");//为啥没运行到这？
    }
}
