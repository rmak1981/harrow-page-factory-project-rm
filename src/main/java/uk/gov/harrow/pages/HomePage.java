package uk.gov.harrow.pages;/*
 * Ravi's Creation
 * Date of Creation
 */

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.gov.harrow.utility.UtilityRM;

public class HomePage extends UtilityRM {

    // initiate log4j properties
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    // corona virus service tab clik
    @FindBy(xpath = "//div[@class='page-content']//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]")
    WebElement _coronaVirusServicePageLink;


    public void clickOnCoronaVirusPageLink(){
        Reporter.log("Click on corona virus page"+_coronaVirusServicePageLink.toString()+"<br>");
        clickOnElement(_coronaVirusServicePageLink);
        log.info("Click on corona virus page"+_coronaVirusServicePageLink.toString());
    }

}
