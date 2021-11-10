package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DraggablePageElements extends AbstractPageElements{

    @FindBy(css = "iframe.demo-frame")
    public WebElement frame;

    @FindBy(css = "div.ui-draggable-handle")
    public WebElement draggableDiv;

    public DraggablePageElements(WebDriver driver) {
        super(driver);
    }
}
