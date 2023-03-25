package com.qaprosoft.carina.demo.example.exercise;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.exercise.instagram.InstagramHomePage;
import com.qaprosoft.carina.demo.exercise.instagram.InstagramSignInPage;
import com.qaprosoft.carina.demo.exercise.service.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InstagramSignInTest extends AbstractTest {

    @Test
    public void signInTest(){
        User user = new User("_saba_evgenidze_", "kvadrata123");
        InstagramHomePage instagramHomePage = new InstagramHomePage(getDriver());
        instagramHomePage.open();
        instagramHomePage.fillEmailField(user.getUser());
        instagramHomePage.fillPasswordField(user.getPassword());

        InstagramSignInPage instagramSignInPage = instagramHomePage.clickLoginButton();

        Assert.assertTrue(instagramSignInPage.isPageOpened(), "Sign in button isn't working");
    }
}
