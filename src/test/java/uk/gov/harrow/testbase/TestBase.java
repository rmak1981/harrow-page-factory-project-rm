package uk.gov.harrow.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.gov.harrow.basepage.BasePage;
import uk.gov.harrow.browserselector.BrowserSelector;
import uk.gov.harrow.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class TestBase extends BasePage {


    BrowserSelector selectBrowser = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseUrl = loadProperty.getProperty("baseURL");
    String browser = loadProperty.getProperty("browser");

    @BeforeMethod
    public void openBrowser(){
        selectBrowser.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }
    @AfterMethod

    public void tearDown(){
        driver.quit();
    }



}
