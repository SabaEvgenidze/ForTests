package com.qaprosoft.carina.demo.laba;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class VerifyHomeScreen extends AbstractPage {

    @FindBy(xpath = )
    ExtendedWebElement digitalCode;

    @FindBy(xpath = )

    public VerifyHomeScreen(WebDriver driver) {
        super(driver);
    }
}
