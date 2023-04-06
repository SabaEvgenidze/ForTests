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
        String error = "There was a problem logging you into Instagram. Please try again soon.";
        User user = new User("username", "password");
        InstagramHomePage instagramHomePage = new InstagramHomePage(getDriver());
        instagramHomePage.open();
        instagramHomePage.fillEmailField(user.getUser());
        instagramHomePage.fillPasswordField(user.getPassword());
        instagramHomePage.clickLoginButton();

        InstagramSignInPage instagramSignInPage = new InstagramSignInPage(getDriver());
        Assert.assertTrue(instagramSignInPage.isErrorMassagePresented(error), "Sign in button isn't working");
    }
}
