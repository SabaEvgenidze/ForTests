package com.qaprosoft.carina.demo.example;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.laba.YahooHomePage;
import com.qaprosoft.carina.demo.laba.YahooSignInScreen;
import com.qaprosoft.carina.demo.laba.YahooVerifyHomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YahooSignInTest extends AbstractTest {

    @Test
    public void loginTest(){
        YahooHomePage yahooHomePage = new YahooHomePage(getDriver());
        yahooHomePage.open();
        yahooHomePage.clickSignInButton();
        ///////

        YahooSignInScreen yahooSignInScreen = new YahooSignInScreen(getDriver());
        yahooSignInScreen.open();
        yahooSignInScreen.fillUserNameField("ajariswyali123@gmail.com");
        yahooSignInScreen.clickNextButton();
        ///////////////

        YahooVerifyHomeScreen yahooVerifyHomeScreen = new YahooVerifyHomeScreen(getDriver());
        yahooVerifyHomeScreen.open();
        yahooVerifyHomeScreen.fillDigitalCodeField("code!");
        yahooVerifyHomeScreen.clickVerifyButton();
    }

}
