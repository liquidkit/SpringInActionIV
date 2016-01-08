package pl.liquidkit.springinaction4.chapter03.conditions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Jacek on 2016-01-08.
 */
@Configuration
public class MagicBean {
    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }
}
