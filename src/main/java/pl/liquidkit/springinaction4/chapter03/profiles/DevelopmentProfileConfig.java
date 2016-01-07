package pl.liquidkit.springinaction4.chapter03.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.activation.DataSource;

/**
 * Created by Jacek on 2016-01-07.
 */
@Configuration
@Profile("dev")
public class DevelopmentProfileConfig {
    @Bean(destroyMethod = "shutdown")
    public DataSource dataSource() {
        return null;
    }
}
