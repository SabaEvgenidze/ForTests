package com.qaprosoft.carina.demo.api.method;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(url = "${base_url}/posts", methodType = HttpMethodType.GET)
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
@ResponseTemplatePath(path = "api/users/exercise/_get/response.json")
public class GetArticleMethod extends AbstractApiMethodV2 {
    public GetArticleMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
