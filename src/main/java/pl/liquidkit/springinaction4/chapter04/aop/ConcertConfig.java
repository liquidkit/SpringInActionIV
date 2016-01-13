package pl.liquidkit.springinaction4.chapter04.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pl.liquidkit.springinaction4.chapter02.di.soundsystem.BlankDisc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jacek on 2016-01-12.
 */
@Configuration
@EnableAspectJAutoProxy
public class ConcertConfig {
    @Bean
    public Audience audience() {
        return new Audience();
    }

    @Bean
    public Performance concert() {
        return new Concert();
    }

//    @Bean
//    public Encoreable encoreable() {
//        return new DefaultEncoreable();
//    }

    @Bean
    public EncoreableIntroducer encoreableIntroducer() {
        return new EncoreableIntroducer();
    }
}
