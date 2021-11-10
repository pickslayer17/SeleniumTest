package lib;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class FlowLib {

    private WebDriver driver;

    public FlowLib(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUrl(String url) {
        this.driver.get(url);
    }

    public String getCurrentUrl(){
        return this.driver.getCurrentUrl();
    }

    public String getCurrentPageTitle(){
        return this.driver.getTitle();
    }

    public void getScreenShot(String fileName)  {
        try {
            FileUtils.copyFile(((TakesScreenshot)this.driver).getScreenshotAs(OutputType.FILE), new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
