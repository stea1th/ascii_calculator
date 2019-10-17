package ascii.calculator.jersey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
//        PropertySourcesPlaceholderConfigurer propsConfig
//                = new PropertySourcesPlaceholderConfigurer();
//        propsConfig.setLocation(new ClassPathResource("git.properties"));
//        propsConfig.setIgnoreResourceNotFound(true);
//        propsConfig.setIgnoreUnresolvablePlaceholders(true);
//        return propsConfig;
//    }
}
