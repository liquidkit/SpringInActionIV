package pl.liquidkit.springinaction4.chapter03.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.activation.DataSource;

/**
 * Created by Jacek on 2016-01-07.
 */
@Configuration
public class DataSourceConfig {

    @Bean(destroyMethod = "shutdown")
    @Profile("dev")
    public DataSource embeddedDataSource() {
        return null;
    }

    @Bean
    @Profile("prod")
    public DataSource jndiDataSource() {
        return null;
    }
}
