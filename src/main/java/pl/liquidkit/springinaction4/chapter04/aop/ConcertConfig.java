package pl.liquidkit.springinaction4.chapter04.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Jacek on 2016-01-12.
 */
@Configuration
public class ConcertConfig {
    @Bean
    public Audience audience() {
        return new Audience();
    }
}
