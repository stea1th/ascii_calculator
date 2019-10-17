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
        String name = new StringBuilder().append(env.getProperty("git.build.version"))
                .append("-")
                .append(env.getProperty("git.total.commit.count"))
                .append("-")
                .append(env.getProperty("git.commit.id.abbrev"))
                .append("-")
                .append(env.getProperty("git.build.time"))
                .toString();
        System.out.println(name);
        return name;
    }


}
