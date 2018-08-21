import org.testng.annotations.Test;

public class BaseAnnotation {
    @Test
    public void testCase01(){
        System.out.println("ThreadId: " + Thread.currentThread().getId() + ", BaseAnnotation， testcase01运行了");
//        System.out.println("ThreadId: " + Thread.currentThread().getId());
    }

    @Test(enabled = true)
    public void testCase02(){
        System.out.println("ThreadId: " + Thread.currentThread().getId() + ", BaseAnnotation， testcase02运行了");
//        System.out.println("ThreadId: " + Thread.currentThread().getId());
    }
    @Test(enabled = true)
    public void testCase03(){
        System.out.println("ThreadId:" + Thread.currentThread().getId() + ", BaseAnnotation， testCase03运行了");
    }

}
