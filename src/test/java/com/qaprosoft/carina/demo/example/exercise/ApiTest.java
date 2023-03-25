package com.qaprosoft.carina.demo.example.exercise;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.api.method.GetArticleMethod;
import com.qaprosoft.carina.demo.api.method.PostArticleName;
import org.testng.annotations.Test;

public class ApiTest implements IAbstractTest {

    @Test()
    public void setPostUserMethod() {
        PostArticleName api = new PostArticleName();
        api.callAPIExpectSuccess();
        api.validateResponse();
    }

    @Test()
    public void setGetMethod(){
        GetArticleMethod api = new GetArticleMethod();
        api.callAPIExpectSuccess();
        api.validateResponse();
    }

}
