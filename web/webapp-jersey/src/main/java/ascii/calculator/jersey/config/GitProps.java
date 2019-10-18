package ascii.calculator.jersey.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:git.properties")
public class GitProps {

    @Autowired
    private Environment env;

    public String version() {
        return env.getProperty("git.build.version") +
                "-" +
                env.getProperty("git.total.commit.count") +
                "-" +
                env.getProperty("git.commit.id.abbrev") +
                "-" +
                env.getProperty("git.build.time");
    }


}
