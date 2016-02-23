package com.kth.peonsson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("tjenare")
public class HelloWorldResource {

    @QueryParam("name") String name;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ReturnData getHello() {

        ReturnData newReply = new ReturnData();
        newReply.setReply("hej " + name + ", allt bra?");

        return newReply;
    }
}