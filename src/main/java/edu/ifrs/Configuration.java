package edu.ifrs;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath(value = "/ws")
public class Configuration  extends Application{
    

    @Override
    public Set<Class<?>> getClasses(){
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }


private void addRestResourceClasses(Set<Class<?>> resources) {
    resources.add(edu.ifrs.Hello.class);
}
}
