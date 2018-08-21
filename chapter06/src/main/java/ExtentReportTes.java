import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExtentReportTes {

    @Test
    public void test1(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test2(){
        Assert.assertEquals('c','b');
    }
    @Test
    public void test3(){
        Reporter.log("这是我们自己写的日志");
        throw new RuntimeException("这是我们自己的运行时异常");
    }

    @Test
    public void test4(){
        Assert.assertEquals("good","hot");
    }
}
