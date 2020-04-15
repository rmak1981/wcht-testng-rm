package uk.gov.wcht.pages;

import org.openqa.selenium.By;
import uk.gov.wcht.utility.Utility;

public class HomePage extends Utility {

    By yourHomeDropDownLink = By.xpath("//a[@class='header__nav-area-title'][contains(text(),'Your home')]");

    By yourAccountLink = By.xpath("//span[contains(text(),'Your account')]");

    By myAccountText = By.xpath("//div[@class='panel-heading']");

    public void mouseHoverOnYourHome (){mouseHoverToElement(yourHomeDropDownLink);
    }
    public void clickOnYourAccountLink(){ clickOnElement(yourAccountLink);}
    public void varifyMyAccountText(){verifyText(myAccountText," My Account ");}

}
