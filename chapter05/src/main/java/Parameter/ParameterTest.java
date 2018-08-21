package Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void parameter(String name, int age){
        System.out.println("\n name = " + name + ", age = " + age);
    }
}
