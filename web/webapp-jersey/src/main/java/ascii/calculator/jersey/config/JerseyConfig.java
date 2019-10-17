package ascii.calculator.jersey.config;

import ascii.calculator.jersey.controller.CalculatorController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(GitProps.class)
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(CalculatorController.class);
        register(CORSFilter.class);
//        register(GitProps.class);
    }
}
