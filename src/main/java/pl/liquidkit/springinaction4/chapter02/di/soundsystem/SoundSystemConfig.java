package pl.liquidkit.springinaction4.chapter02.di.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Jacek on 2016-01-07.
 */
@Configuration
@Import({CDPlayerConfig.class, CDConfig.class})
//@Import(CDPlayerConfig.class)
//@ImportResource("classpath:beans-config.xml")
public class SoundSystemConfig {
}
