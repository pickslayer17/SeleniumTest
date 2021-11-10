package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DroppablePageElements extends AbstractPageElements{

    @FindBy(id="draggable")
    public WebElement draggable;

    @FindBy(id="droppable")
    public WebElement droppable;

    @FindBy(css = "iframe.demo-frame")
    public WebElement frame;

    public DroppablePageElements(WebDriver driver) {
        super(driver);
    }
}
