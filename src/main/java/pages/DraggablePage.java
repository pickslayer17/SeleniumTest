package pages;

import elements.DraggablePageElements;
import elements.HomePageElements;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DraggablePage {

    String pageUrl = "https://jqueryui.com/draggable/";
    WebDriver driver;
    DraggablePageElements draggablePageElements;
    HomePageElements homePageElements;

    public DraggablePage(WebDriver driver) {
        this.driver = driver;
        draggablePageElements = new DraggablePageElements(driver);
    }

    private int x = 50;
    private int y = 60;
    private Point location;

    public void dragAndDropDiv(int x, int y){
        driver.switchTo().frame(draggablePageElements.frame);
        Actions actions = new Actions(driver);
        location = draggablePageElements.draggableDiv.getLocation();
        this.x = x;
        this.y = y;
        actions.clickAndHold(draggablePageElements.draggableDiv).moveByOffset(x,y).perform();
    }

    public void ValidateDragAndDrop() {
        Point location = draggablePageElements.draggableDiv.getLocation();
        Assert.assertEquals(location.x, this.location.x + x, "Element is not dragged by X axes");
        Assert.assertEquals(location.y, this.location.y + y, "Element is not dragged by X axes");
    }

    public String getPageUrl() {
        return pageUrl;
    }
}
