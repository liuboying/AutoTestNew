package Thread;

import org.testng.annotations.Test;

public class TreadTest {

    @Test(invocationCount = 10,threadPoolSize = 2)
    public void test(){
        System.out.println(1111);
        System.out.println("TheadId=" + Thread.currentThread().getId());
    }
}
