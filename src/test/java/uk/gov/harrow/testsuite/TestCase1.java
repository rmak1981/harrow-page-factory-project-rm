package uk.gov.harrow.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.gov.harrow.pages.CoronaVirusPage;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.testbase.TestBase;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class TestCase1 extends TestBase {
    // object creation of pages
    HomePage homePage;
    CoronaVirusPage coronaVirusPage;

    @BeforeMethod
    public void setUp(){

        homePage = new HomePage();
        coronaVirusPage = new CoronaVirusPage();
    }
    @Test(priority = 1,groups = {"Regression"})
    public void userShouldGeCoronaVirusService(){

        homePage.clickOnCoronaVirusPageLink();
        coronaVirusPage.clickOnAdultSocialCareLink();
    }
}
