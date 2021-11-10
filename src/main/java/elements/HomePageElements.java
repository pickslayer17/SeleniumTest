package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class HomePageElements extends AbstractPageElements {


    //Draggable, Droppable, Resizable, Selectable and Sortable
    @FindBy(xpath = "//aside[@class='widget'][1]/ul/li/a")
    public List<WebElement> interactionsList;


    public HomePageElements(WebDriver driver) {
        super(driver);
    }
}
