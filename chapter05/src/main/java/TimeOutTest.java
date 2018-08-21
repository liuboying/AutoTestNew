import org.testng.annotations.Test;

public class TimeOutTest {
    @Test(timeOut = 4000)
    public void timeOutSucess() throws InterruptedException {
        Thread.sleep(3000);
    }

    @Test(timeOut = 2000)
    public void timeOutFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
