package com.qaprosoft.carina.demo.exercise.instagram;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class InstagramSignInPage extends AbstractPage {
    public InstagramSignInPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.instagram.com/accounts/onetap/?next=%2F");
    }
}
