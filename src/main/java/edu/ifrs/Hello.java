package edu.ifrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class Hello {

    @GET
    public String hello(){
        return "hello ws";
    }
    
}
