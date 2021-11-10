package pages;

import elements.DraggablePageElements;
import elements.DroppablePageElements;
import elements.HomePageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    String pageUrl = "https://jqueryui.com/";
    WebDriver driver;
    HomePageElements homePageElements;
    DraggablePageElements draggablePageElements;
    DroppablePageElements droppablePageElements;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        homePageElements = new HomePageElements(driver);
    }

    public void goToDroppable() {
        WebElement link = homePageElements.interactionsList.get(1);
        link.click();
    }
    public void goToDraggable() {
        WebElement link = homePageElements.interactionsList.get(0);
        link.click();
    }

    public String getPageUrl() {
        return pageUrl;
    }
}
