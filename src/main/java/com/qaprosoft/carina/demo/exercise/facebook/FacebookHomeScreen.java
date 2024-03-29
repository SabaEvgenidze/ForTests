package com.qaprosoft.carina.demo.exercise.facebook;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FacebookHomeScreen extends AbstractPage {
    @FindBy(xpath = "//*[@id = 'email']")
    private ExtendedWebElement emailField;

    @FindBy(xpath = "//*[@id = 'pass']")
    private ExtendedWebElement passField;

    @FindBy(xpath = "//button[text() = 'Log In']")
    private ExtendedWebElement logInButton;

    public FacebookHomeScreen(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.facebook.com/");
    }

    public void fillEmail(String login) {
        emailField.type(login);
    }

    public void fillPasswordField(String password) {
        passField.type(password);
    }

    public FacebookSignInScreen clickLogInButton() {
        logInButton.click();
        return new FacebookSignInScreen(getDriver());
    }
}
