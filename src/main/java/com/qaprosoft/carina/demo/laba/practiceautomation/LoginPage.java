package com.qaprosoft.carina.demo.laba.practiceautomation;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//*[@id = 'username']")
    private ExtendedWebElement usernameField;

    @FindBy(xpath = "//*[@id = 'password']")
    private ExtendedWebElement passwordField;

    @FindBy(xpath = "//*[@id = 'submit']")
    private ExtendedWebElement submitButton;
    public LoginPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://practicetestautomation.com/practice-test-login/");
    }

    public void fillUsernameField(String username){
        usernameField.type(username);
    }

    public void fillPasswordField(String pass){
        passwordField.type(pass);
    }

    public UserPage clickSubmitButton(){
        submitButton.click();
        return new UserPage(getDriver());
    }


}
