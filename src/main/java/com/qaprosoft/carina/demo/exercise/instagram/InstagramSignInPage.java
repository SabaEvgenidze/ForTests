package com.qaprosoft.carina.demo.exercise.instagram;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class InstagramSignInPage extends AbstractPage {

    @FindBy(xpath = "//*[text() = '%s']")
    private ExtendedWebElement errorMassage;
    public InstagramSignInPage(WebDriver driver) {
        super(driver);
    }

    public boolean isErrorMassagePresented(String error){
        return errorMassage.format(error).isPresent();
    }
}
