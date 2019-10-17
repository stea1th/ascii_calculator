package ascii.calculator.jersey.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource( value="classpath:git.properties")
public class GitProps {

    @Autowired
    private Environment env;

    public void version() {
        String name = env.getProperty("git.commit.user.name");
        System.out.println(name);
    }


}
