package ascii.calculator.jersey.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "git")
public class GitProps {

    String tags;
}
