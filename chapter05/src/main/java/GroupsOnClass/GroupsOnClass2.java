package GroupsOnClass;


import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass2 {
    public void teacher1(){
        System.out.println("GroupOnClass2中的teacher11111");
    }

    public void teacher2(){
        System.out.println("GroupOnClass2中的teacher22222");
    }
}
