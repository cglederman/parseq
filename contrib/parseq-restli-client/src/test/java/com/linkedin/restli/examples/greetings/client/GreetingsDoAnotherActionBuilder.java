
package com.linkedin.restli.examples.greetings.client;

import javax.annotation.Generated;
import com.linkedin.data.template.BooleanArray;
import com.linkedin.data.template.StringMap;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.examples.groups.api.TransferOwnershipRequest;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Thu Mar 31 14:16:22 PDT 2016")
public class GreetingsDoAnotherActionBuilder
    extends ActionRequestBuilderBase<Void, Void, GreetingsDoAnotherActionBuilder>
{


    public GreetingsDoAnotherActionBuilder(java.lang.String baseUriTemplate, Class<Void> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("anotherAction");
    }

    public GreetingsDoAnotherActionBuilder paramBitfield(BooleanArray value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("anotherAction").getFieldDef("bitfield"), value);
        return this;
    }

    public GreetingsDoAnotherActionBuilder paramRequest(TransferOwnershipRequest value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("anotherAction").getFieldDef("request"), value);
        return this;
    }

    public GreetingsDoAnotherActionBuilder paramSomeString(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("anotherAction").getFieldDef("someString"), value);
        return this;
    }

    public GreetingsDoAnotherActionBuilder paramStringMap(StringMap value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("anotherAction").getFieldDef("stringMap"), value);
        return this;
    }

}