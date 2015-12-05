package com.example.helloworld;

import com.sun.deploy.Environment;
import javafx.application.Application;
import javafx.stage.Stage;
import javax.ws.rs.GET;

import javax.xml.ws.Service;

/**
 * Created by David Gamaliel on 12/5/2015.
 */
public class HelloWorldApplication extends Application {

    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(HelloWorldConfiguration configuration,
                    Environment environment) {
        // nothing to do yet
    }
}
