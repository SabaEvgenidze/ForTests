package com.qaprosoft.carina.demo.exercise.instagram;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class InstagramHomePage extends AbstractPage {

    @FindBy(xpath = "//* [@name = 'username']")
    private ExtendedWebElement usernameField;

    @FindBy(xpath = "//* [@name = 'password']")
    private ExtendedWebElement passField;

    @FindBy(xpath = "//*[text() = 'Log in']")
    private ExtendedWebElement signInButton;

    public InstagramHomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.instagram.com/");
    }

    public void fillEmailField(String login) {
        usernameField.type(login);
    }

    public void fillPasswordField(String password) {
        passField.type(password);
    }

    public InstagramSignInPage clickLoginButton() {
        signInButton.click();
        return new InstagramSignInPage(getDriver());
    }
}
