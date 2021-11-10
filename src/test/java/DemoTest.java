import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.fail;


public class DemoTest  {

    @Test(dependsOnMethods = {"test2", "test3"}, alwaysRun = false)
    public void test1(){
        System.out.println("Test1");
        System.out.println("------------");

    }

    @Test
    public void test2(){
        System.out.println("Test2");
        System.out.println("------------");
//        fail("Test 2 fails");
//        Assert.assertEquals(0,1);
//        Assert.assertEquals(1,0);
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(0,1);
        sa.assertEquals(1,0);
        sa.assertEquals("","1");
        sa.assertAll();
    }

    @Test
    public void test3(){
        System.out.println("Test3");
        System.out.println("------------");
    }

    @Test
    public void test4(){
        System.out.println("Test4");
        System.out.println("------------");
    }

    @Test(dataProvider = "dataProvider1", dataProviderClass = DataProviderTest.class, groups = "P0")
    public void test5(String p1, String p2, String p3){

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("Test5");
        System.out.println("------------");
    }
}
