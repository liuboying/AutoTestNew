import org.testng.annotations.Test;

public class ExpectException {
    /**
     *什么时候用到：当预期结果为某个异常时，需要用到异常测试
     * 比如：当代码接收到非法参数时，代码会抛出某个异常
     * 此时需要用到对应的异常测试
     *
     */

    @Test(expectedExceptions = RuntimeException.class)
    public void exceptExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void exceptExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
