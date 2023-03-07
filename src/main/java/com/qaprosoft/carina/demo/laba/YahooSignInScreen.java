package com.qaprosoft.carina.demo.laba.service;

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
    }


}
