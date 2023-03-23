package com.qaprosoft.carina.demo.example.exercise;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.laba.facebook.FacebookSingInService;
import org.testng.annotations.Test;


public class FacebookSignInTest extends AbstractTest {
    @Test
    public void signInTest() {
        FacebookSingInService facebookSingInService = new FacebookSingInService();
        facebookSingInService.login();
    }

}
