package uk.gov.wcht.testbase;

import com.google.inject.spi.StaticInjectionRequest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.gov.wcht.basepage.BasePage;
import uk.gov.wcht.browserselector.BrowserSelector;
import uk.gov.wcht.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

    BrowserSelector selectBrowser = new BrowserSelector(); // object created for browser selector
    LoadProperty loadProperty = new LoadProperty();// object created for load property

    String baseURL = loadProperty.getProperty("baseURL");
    String browser = loadProperty.getProperty("browser");


    @BeforeMethod
    public void openBrowser() {
        selectBrowser.selectBrowser(browser); //  selecting browser from config property
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseURL);// opening url form config property
    }
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}

