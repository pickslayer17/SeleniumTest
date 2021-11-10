import elements.DroppablePageElements;
import lib.AppLib;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import pages.DraggablePage;
import pages.DroppablePage;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public abstract class AbstractBaseTest {

    WebDriver driver;

    private AppLib app;

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @Parameters({"browser", "driverexe"})
    @BeforeMethod(alwaysRun = true)
    public void setup(@Optional("Chrome") String browser, @Optional("C:/chromedriver.exe") String exe) {
        System.out.println("Method starts");
        if (browser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", exe);
            driver = new ChromeDriver();
        } else if (browser.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver", exe);
            driver = new FirefoxDriver();
        } else {
            System.err.println("Driver name \"" + browser + "\" in parameter is incorrect");
        }


        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        app = new AppLib(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.close();
        System.out.println("Method ends");
    }




    public AppLib App() {
        return app;
    }
}
