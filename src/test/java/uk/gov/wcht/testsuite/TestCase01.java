package uk.gov.wcht.testsuite;

import org.testng.annotations.Test;
import uk.gov.wcht.pages.HomePage;
import uk.gov.wcht.testbase.TestBase;

public class TestCase01 extends TestBase {

    HomePage homePage = new HomePage();

@Test
    public void verifyUserShouldMouseHoverOnYourHomeLink (){
    homePage.mouseHoverOnYourHome();
    homePage.clickOnYourAccountLink();
    homePage.varifyMyAccountText();
}
}
