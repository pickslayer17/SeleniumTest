package pages;

import elements.DroppablePageElements;
import elements.HomePageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DroppablePage {

    String pageUrl = "https://jqueryui.com/droppable/";
    WebDriver driver;
    HomePageElements homePageElements;
    DroppablePageElements droppablePageElements;

    public DroppablePage(WebDriver driver) {
        this.driver = driver;
        droppablePageElements = new DroppablePageElements(driver);
    }


    public void dragAndDropDraggableToDroppable() {
        driver.switchTo().frame(droppablePageElements.frame);
        Actions actions = new Actions(driver);
        actions.clickAndHold(droppablePageElements.draggable).moveToElement(droppablePageElements.droppable).perform();
    }

    public String getPageUrl() {
        return pageUrl;
    }
}
