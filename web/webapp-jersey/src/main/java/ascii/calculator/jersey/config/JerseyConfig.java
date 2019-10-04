package ascii.calculator.jersey.config;

import ascii.calculator.jersey.service.CalculatorService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(CalculatorService.class);
    }
}
