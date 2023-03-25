package com.qaprosoft.carina.demo.api.method;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(url = "${base_url}/posts", methodType = HttpMethodType.POST)
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
@RequestTemplatePath(path = "api/users/exercise/_post/request.json")
@ResponseTemplatePath(path = "api/users/exercise/_post/response.json")
public class PostArticleName extends AbstractApiMethodV2 {
    public PostArticleName(){
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
