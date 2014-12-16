package com.rattboi.deprest

import com.rattboi.deprest.controllers.DefaultController
import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class DeprestApplication extends Application<DeprestConfiguration> {

    public static void main(String[] args) {
        new DeprestApplication().run(args);
    }

    @Override
    void initialize(Bootstrap<DeprestConfiguration> bootstrap) {

    }

    @Override
    void run(DeprestConfiguration configuration, Environment environment) {
        environment.jersey().register(DefaultController.class)
    }
}
