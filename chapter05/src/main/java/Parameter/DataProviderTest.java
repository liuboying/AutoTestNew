package Parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){
        System.out.println("\ntestDataProvider name=" + name + ", age=" + age);
    }

    @DataProvider(name="data")
    public Object[][] dataProvider(){
        Object[][] o = new Object[][]{
                {"zhangsan",1},
                {"lisi",2},
                {"wangwu",10}
        };
        return o;
    }


    @Test(dataProvider = "dataMethod")
    public void test1(String name,int age){
        System.out.println("\ntest11111 name=" + name + ", age=" + age);
    }

    @Test(dataProvider = "dataMethod")
    public void test2(String name,int age){
        System.out.println("\ntest2222，2年后 name=" + name + ", age=" + age);
    }


    @DataProvider(name = "dataMethod")
    public Object[][] dataProviderMethod(Method method){
        Object[][] o1= null;
//        System.out.println(method.getName());
        if(method.getName().equals("test1")){
            o1 = new Object[][]{
                    {"刘大奔",1},
                    {"刘小天",2}
            };
        }else if(method.getName().equals("test2")){
            o1 = new Object[][]{
                    {"刘大奔",4},
                    {"刘小天",6}
            };
        }

        return o1;
    }
}
