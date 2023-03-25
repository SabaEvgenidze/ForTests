package com.qaprosoft.carina.demo.exercise.practiceautomation;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class UserPage extends AbstractPage {

    @FindBy(xpath = "//*[text() = 'Log out']")
    private ExtendedWebElement logOutButton;

    public UserPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://practicetestautomation.com/logged-in-successfully/");
    }

    public LoginPage clickLogUotButton() {
        logOutButton.click();
        return new LoginPage(getDriver());
    }

}
