package com.qaprosoft.carina.demo.exercise.facebook;

import com.qaprosoft.carina.core.foundation.webdriver.IDriverPool;
import com.qaprosoft.carina.demo.exercise.service.User;
import org.testng.Assert;

public class FacebookSingInService implements IDriverPool {

    public void login(){
        User user = new User("saba_evgenidze@mail.ru","ylepia123456789");
        FacebookHomeScreen facebookHomeScreen = new FacebookHomeScreen(getDriver());
        facebookHomeScreen.open();
        facebookHomeScreen.fillEmail(user.getUser());
        facebookHomeScreen.fillPasswordField(user.getPassword());
        FacebookSignInScreen facebookSignInScreen = facebookHomeScreen.clickLogInButton();
        Assert.assertTrue(facebookSignInScreen.isPageOpened(),"page isn't opened");
    }

}
