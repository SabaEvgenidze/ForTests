package com.qaprosoft.carina.demo.laba;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class YahooSignInScreen extends AbstractPage {

    @FindBy(xpath = "//* [@id = 'login-username']")
    ExtendedWebElement userNameField;

    @FindBy(xpath = "//* [@class = 'button-container']//*[@id = 'login-signin']")
    ExtendedWebElement nextButton;

    public YahooSignInScreen(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://login.yahoo.com/?.lang=en-US&src=homepage&activity=ybar-signin&pspid=2023538075&done=https%3A%2F%2Fwww.yahoo.com%2F&add=1");
    }

    public void fillUserNameField(String Username){
        userNameField.type(Username);
    }

    public YahooVerifyHomeScreen clickNextButton(){
        nextButton.click();
        return new YahooVerifyHomeScreen(getDriver());
    }

}
