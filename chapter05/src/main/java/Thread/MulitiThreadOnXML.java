package Thread;

import org.testng.annotations.Test;

public class MulitiThreadOnXML {


    @Test
    public void test1(){
        System.out.println("ThreadID:" + Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.println("ThreadID:" + Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.println("ThreadID:" + Thread.currentThread().getId());
    }
}
