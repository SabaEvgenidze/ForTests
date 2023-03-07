package com.qaprosoft.carina.demo.example;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.laba.FacebookHomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FacebookSignInTest extends AbstractTest {
    @Test
    public void signInTest() {
        FacebookHomeScreen facebookHomeScreen = new FacebookHomeScreen(getDriver());
        facebookHomeScreen.open();
        facebookHomeScreen.fillEmail("saba_evgenidze@mail.ru");
        facebookHomeScreen.fillPasswordField("ylepia123456789");

        Assert.assertTrue(facebookHomeScreen.isPageOpened(), "Page isn;t opened");
    }

}
