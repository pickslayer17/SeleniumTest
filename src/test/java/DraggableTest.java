
import io.cucumber.java.en.Given;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.DraggablePage;
import pages.HomePage;


public class DraggableTest extends AbstractBaseTest {


    @Parameters({"x","y"})
    @Test(groups = {"P0", "P1"})
    public void draggableTest(@Optional("10") String x, @Optional("10") String y) {
        App().Flow().navigateToUrl(App().Pages().HomePage().getPageUrl());
        App().Pages().HomePage().goToDraggable();

        String expectedUrl = App().Pages().DraggablePage().getPageUrl();
        String newUrl = App().Flow().getCurrentUrl();
        Assert.assertEquals(newUrl, expectedUrl, "Url doesn't respond expected");


        App().Pages().DraggablePage().dragAndDropDiv(Integer.parseInt(x) , Integer.parseInt(y) );
        App().Pages().DraggablePage().ValidateDragAndDrop();
        App().Flow().getScreenShot("./screenshots/SuccessDrag.png");
    }

    @Parameters({"x","y"})
    @Test(groups = "P1") @Ignore
    public void threadTest(String x, String y){
        System.out.println("ThreadTest frome draggable");
        App().Flow().navigateToUrl("https://gmail.com/");
        App().Pages().DraggablePage().dragAndDropDiv(Integer.parseInt(x) , Integer.parseInt(y) );
    }

    @Test(groups = "P0")
    public void threadTest2(){
        System.out.println("Just system out for thread test2");
    }

}
