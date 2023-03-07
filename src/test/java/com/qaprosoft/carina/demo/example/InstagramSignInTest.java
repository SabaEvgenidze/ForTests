package com.qaprosoft.carina.demo.example;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.laba.InstagramHomePage;
import com.qaprosoft.carina.demo.laba.InstagramSignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InstagramSignInTest extends AbstractTest {

    @Test
    public void signInTest(){
        InstagramHomePage instagramHomePage = new InstagramHomePage(getDriver());
        instagramHomePage.open();
        instagramHomePage.fillEmailField("Here is login test");
        instagramHomePage.fillPasswordField("Here is password test");

        InstagramSignInPage instagramSignInPage = instagramHomePage.clickLoginButton();
        Assert.assertTrue(instagramSignInPage.isPageOpened(), "Sign in button isn't working");
    }
}
