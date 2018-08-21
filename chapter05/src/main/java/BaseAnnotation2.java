import org.testng.annotations.Test;

public class BaseAnnotation2 {
    @Test
    public void testCase01(){
        System.out.println("ThreadId:" + Thread.currentThread().getId() + ", BaseAnnotation2， testCase011111");
    }

    @Test
    public void testCase02(){
        System.out.println("ThreadId:" + Thread.currentThread().getId() + ", BaseAnnotation2， testCase022222");
    }
}
