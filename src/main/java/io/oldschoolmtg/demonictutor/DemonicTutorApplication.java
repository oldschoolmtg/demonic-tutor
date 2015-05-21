package io.oldschoolmtg.demonictutor;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DemonicTutorApplication extends Application<DemonicTutorConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DemonicTutorApplication().run(args);
    }

    @Override
    public String getName() {
        return "Demonic Tutor";
    }

    @Override
    public void initialize(final Bootstrap<DemonicTutorConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DemonicTutorConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
