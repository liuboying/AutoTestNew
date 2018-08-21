import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void test1(){
        System.out.println("ThreadId:" + Thread.currentThread().getId() + ",这是test1执行");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("ThreadId:" + Thread.currentThread().getId() + ",这是test2执行");
    }
}
