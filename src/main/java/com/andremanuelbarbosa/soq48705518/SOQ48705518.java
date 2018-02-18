package com.andremanuelbarbosa.soq48705518;

import io.dropwizard.Application;
import io.dropwizard.bundles.assets.ConfiguredAssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class SOQ48705518 extends Application<SOQ48705518Configuration> {

    @Override
    public void initialize(Bootstrap<SOQ48705518Configuration> bootstrap) {

        bootstrap.addBundle(new ConfiguredAssetsBundle());
    }

    @Override
    public void run(SOQ48705518Configuration soq48705518Configuration, Environment environment) throws Exception {

    }

    public static void main(String[] args) throws Exception {

        new SOQ48705518().run(args);
    }
}
