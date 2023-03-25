package com.qaprosoft.carina.demo.example.exercise;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.exercise.practiceautomation.LoginPage;
import com.qaprosoft.carina.demo.exercise.practiceautomation.UserPage;
import com.qaprosoft.carina.demo.exercise.service.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeAutomation implements IAbstractTest {

    @Test
    public void loginTest(){
        User user  = new User("student", "Password123");
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        loginPage.fillUsernameField(user.getUser());
        loginPage.fillPasswordField(user.getPassword());
        UserPage validateLoginPage = loginPage.clickSubmitButton();
        Assert.assertTrue(validateLoginPage.isPageOpened());

        UserPage userPage = new UserPage(getDriver());
        LoginPage validateUserPage = userPage.clickLogUotButton();
        Assert.assertTrue(validateUserPage.isPageOpened());
    }
}
