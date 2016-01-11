package pl.liquidkit.springinaction4.chapter03.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import pl.liquidkit.springinaction4.chapter02.di.soundsystem.BlankDisc;

/**
 * Created by Jacek on 2016-01-11.
 */
@Configuration
@ImportResource("classpath:beans-scope-config.xml")
@PropertySource("classpath:app.properties")
public class ExpressiveConfig {
    @Autowired
    private Environment env;

    @Bean
    public BlankDisc disc() {
        return new BlankDisc(
                env.getProperty("disc.title"),
                env.getProperty("disc.artist")
        );
    }
}
