
package com.linkedin.restli.examples.greetings.client;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.FindRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.examples.greetings.api.Empty;
import com.linkedin.restli.examples.greetings.api.EmptyArray;
import com.linkedin.restli.examples.greetings.api.EmptyMap;
import com.linkedin.restli.examples.greetings.api.Greeting;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Thu Mar 31 14:16:23 PDT 2016")
public class GreetingsTaskFindByEmptyRequestBuilder
    extends FindRequestBuilderBase<Long, Greeting, GreetingsTaskFindByEmptyRequestBuilder>
{


    public GreetingsTaskFindByEmptyRequestBuilder(String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, Greeting.class, resourceSpec, requestOptions);
        super.name("empty");
    }

    public GreetingsTaskFindByEmptyRequestBuilder arrayParam(EmptyArray value) {
        super.setReqParam("array", value, EmptyArray.class);
        return this;
    }

    public GreetingsTaskFindByEmptyRequestBuilder arrayParam(Iterable<Empty> value) {
        super.setReqParam("array", value, Empty.class);
        return this;
    }

    public GreetingsTaskFindByEmptyRequestBuilder addArrayParam(Empty value) {
        super.addReqParam("array", value, Empty.class);
        return this;
    }

    public GreetingsTaskFindByEmptyRequestBuilder mapParam(EmptyMap value) {
        super.setReqParam("map", value, EmptyMap.class);
        return this;
    }

}
