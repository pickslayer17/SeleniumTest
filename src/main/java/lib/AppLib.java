package lib;

import org.openqa.selenium.WebDriver;

public class AppLib {

    private WebDriver driver;

    private PageLib pages;
    private FlowLib flow;

    public AppLib(WebDriver driver) {
        this.driver = driver;
        pages = new PageLib(driver);
        flow = new FlowLib(driver);
    }

    public FlowLib Flow(){
        return flow;
    }

    public PageLib Pages() {
        return pages;
    }
}
