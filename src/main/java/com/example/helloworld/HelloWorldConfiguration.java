package com.example.helloworld;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;


/**
 * Created by David Gamaliel on 12/5/2015.
 */
public class HelloWorldConfiguration extends Configuration {

    private String template;
    private String defaultName = "Stranger";

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getDefaultName() {
        return defaultName;
    }

    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

    @Override
    public AppConfigurationEntry[] getAppConfigurationEntry(String name) {
        return new AppConfigurationEntry[0];
    }
}
