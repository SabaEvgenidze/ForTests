package com.qaprosoft.carina.demo.exercise.facebook;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;


public class FacebookSignInScreen extends AbstractPage {
    public FacebookSignInScreen(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.facebook.com/");
    }
}
