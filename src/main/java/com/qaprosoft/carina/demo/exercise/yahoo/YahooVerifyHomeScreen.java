package com.qaprosoft.carina.demo.exercise.yahoo;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class YahooVerifyHomeScreen extends AbstractPage {

    @FindBy(xpath = "//*[@id = 'verification-code-field']")
    ExtendedWebElement verifyCodeField;

    @FindBy(xpath = "//*[@id = 'verify-code-button']")
    ExtendedWebElement verifyButton;



    public YahooVerifyHomeScreen(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://login.yahoo.com/account/challenge/email-verify?.lang=en-US&src=homepage&activity=ybar-signin&pspid=2023538075&done=https%3A%2F%2Fwww.yahoo.com%2F&add=1&sessionIndex=Qw--&acrumb=i84NhghE&display=login&authMechanism=primary");
    }

    public void fillDigitalCodeField(String code){
        verifyCodeField.type(code);
    }

    public Verify clickVerifyButton(){
        verifyButton.click();
        return new Verify(getDriver());
    }


}
