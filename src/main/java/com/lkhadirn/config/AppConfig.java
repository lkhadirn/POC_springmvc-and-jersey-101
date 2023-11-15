package com.lkhadirn.config;

import com.lkhadirn.jersy.MyJerseyService;
import org.glassfish.jersey.server.ResourceConfig;

public class AppConfig extends ResourceConfig {
    public AppConfig() {
        super();
        registerClasses(MyJerseyService.class);
    }
}
