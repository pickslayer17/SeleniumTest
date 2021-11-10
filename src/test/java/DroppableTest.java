import lib.AppLib;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.DroppablePage;
import pages.HomePage;

public class DroppableTest extends AbstractBaseTest {


    @Test(groups = {"P0"})
    public void droppableTest() {
        App().Flow().navigateToUrl(App().Pages().HomePage().getPageUrl());
        App().Pages().HomePage().goToDroppable();


        String expectedUrl = App().Pages().DroppablePage().getPageUrl();
        String newUrl = App().Flow().getCurrentUrl();
        Assert.assertEquals(newUrl, expectedUrl, "Url doesn't respond expected");

        App().Pages().DroppablePage().dragAndDropDraggableToDroppable();
        App().Flow().getScreenShot("./screenshots/SuccessDrag&Drop.png");

    }

    @Test(groups = {"P1"}) @Ignore
    public void justTest(){
        App().Flow().navigateToUrl(App().Pages().HomePage().getPageUrl());
        App().Flow().getScreenShot("./screenshots/HomePage.png");
    }
}
