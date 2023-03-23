package com.qaprosoft.carina.demo.example.exercise;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.api.method.GetMethod;
import com.qaprosoft.carina.demo.api.method.PostUserMethod;
import org.testng.annotations.Test;

public class ApiTest implements IAbstractTest {

    @Test
    public void setPostUserMethod() {
        PostUserMethod api = new PostUserMethod();
        api.callAPIExpectSuccess();
    }


    @Test
    public void setGetMethod(){
        GetMethod api = new GetMethod();
        api.callAPIExpectSuccess();
    }

}
