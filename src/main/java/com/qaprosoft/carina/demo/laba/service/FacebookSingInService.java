package com.qaprosoft.carina.demo.laba.service;

import com.qaprosoft.carina.core.foundation.webdriver.IDriverPool;
import com.qaprosoft.carina.demo.laba.FacebookHomeScreen;

public class FacebookSingInService implements IDriverPool {

    public void login(){
        FacebookHomeScreen facebookHomeScreen = new FacebookHomeScreen(getDriver());
        facebookHomeScreen.open();
        facebookHomeScreen.fillEmail("Sabe");
        facebookHomeScreen.fillPasswordField("Evgenidze");
        facebookHomeScreen.clickLogInButton();
    }

}
