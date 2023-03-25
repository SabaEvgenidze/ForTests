package com.qaprosoft.carina.demo.api.method;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(methodType = HttpMethodType.POST, url = "${base_url}/posts")
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
@ResponseTemplatePath(path = "api/exercise/_post/response.json")
@RequestTemplatePath(path = "api/exercise/_post/request.json")
public class PostArticleName extends AbstractApiMethodV2 {
    public PostArticleName(){
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
