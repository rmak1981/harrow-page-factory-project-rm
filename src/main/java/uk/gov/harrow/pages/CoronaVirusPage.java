package uk.gov.harrow.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.gov.harrow.utility.UtilityRM;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class CoronaVirusPage extends UtilityRM {

    // initiate log4jproperties
    private static final Logger log = LogManager.getLogger(CoronaVirusPage.class.getName());

    // adult social care page
    @FindBy(xpath = "//a[contains(text(),'Adult Social Care Coronavirus page')]")
    WebElement _adultSocialCarePage;


    public void clickOnAdultSocialCareLink(){
        Reporter.log("click on Adult Social Care"+_adultSocialCarePage.toString()+"<br>");
        clickOnElement(_adultSocialCarePage);
    }
}
