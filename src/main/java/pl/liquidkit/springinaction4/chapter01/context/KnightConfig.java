package pl.liquidkit.springinaction4.chapter01.context;

import org.springframework.context.annotation.Bean;

/**
 * Created by Jacek on 2016-01-05.
 */
public class KnightConfig {
    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
