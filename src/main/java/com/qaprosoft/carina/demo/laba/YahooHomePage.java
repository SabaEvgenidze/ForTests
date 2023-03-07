package com.qaprosoft.carina.demo.laba;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class YahooHomePage extends AbstractPage {

    @FindBy(xpath = "//*[@class = '_yb_o69s5']")
    ExtendedWebElement singInButton;


    public YahooHomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.yahoo.com/");
    }

    public YahooSignInScreen clickSignInButton(){
        singInButton.click();
        return new YahooSignInScreen(getDriver());
    }

}
