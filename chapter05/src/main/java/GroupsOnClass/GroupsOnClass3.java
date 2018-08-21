package GroupsOnClass;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass3 {
    @Test
    public void stu1(){
        System.out.println("GroupOnClass3中的stu11111");
    }

    public void stu2(){
        System.out.println("GroupOnClass3中的stu222222");
    }
}
