package ascii.calculator.jersey.config;

import ascii.calculator.jersey.controller.CalculatorController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(CalculatorController.class);
        register(CORSFilter.class);
    }
}
