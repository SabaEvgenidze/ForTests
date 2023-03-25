package com.qaprosoft.carina.demo.exercise.facebook;

import com.qaprosoft.carina.core.foundation.webdriver.IDriverPool;
import com.qaprosoft.carina.demo.exercise.service.User;
import org.testng.Assert;

public class FacebookSingInService implements IDriverPool {
    public void login(){
        User user = new User("email","password");
        FacebookHomeScreen facebookHomeScreen = new FacebookHomeScreen(getDriver());
        facebookHomeScreen.open();
        facebookHomeScreen.fillEmail(user.getUser());
        facebookHomeScreen.fillPasswordField(user.getPassword());
        FacebookSignInScreen facebookSignInScreen = facebookHomeScreen.clickLogInButton();
        Assert.assertTrue(facebookSignInScreen.isPageOpened(),"page isn't opened");
    }

}
