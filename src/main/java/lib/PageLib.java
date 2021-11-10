package lib;

import org.openqa.selenium.WebDriver;
import pages.DraggablePage;
import pages.DroppablePage;
import pages.HomePage;

public class PageLib {

    private WebDriver driver;

    private HomePage homePage;
    private DraggablePage draggablePage;
    private DroppablePage droppablePage;

    public PageLib(WebDriver driver) {
        this.driver = driver;
        this.homePage = new HomePage(driver);
        this.draggablePage = new DraggablePage(driver);
        this.droppablePage = new DroppablePage(driver);
    }

    public HomePage HomePage() {
        return homePage;
    }

    public DraggablePage DraggablePage() {
        return draggablePage;
    }

    public DroppablePage DroppablePage() {
        return droppablePage;
    }
}
