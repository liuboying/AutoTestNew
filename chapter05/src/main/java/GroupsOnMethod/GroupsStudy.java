package GroupsOnMethod;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsStudy {

    @Test(groups = "server")
    public void test1(){
        System.out.println("服务端测试用例11111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("服务端测试用例22222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("客户端测试用例33333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("客户端测试用例4444");
    }

    @BeforeGroups(groups = "client")
    public void beforeGroups(){
        System.out.println("BeforeGroups，在客户端测试组运行前运行");
    }

    @AfterGroups(groups = "client")
    public void afterGroups(){
        System.out.println("AfterGropus，在客户端测试组运行之后运行");
    }
}
