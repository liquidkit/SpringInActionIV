package pl.liquidkit.springinaction4.chapter02.di.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Jacek on 06.01.2016.
 */
@Configuration
//@ComponentScan
//@ComponentScan("pl.liquidkit.springinaction4.chapter02.di.soundsystem")
//@ComponentScan(basePackageClasses = CompactDisc.class)
public class CDPlayerConfig {

    @Bean
    public MediaPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }

    @Bean
    public MediaPlayer anotherCdPlayer() {
        return new CDPlayer(sgtPeppers());
    }

    @Bean
    public MediaPlayer compactDiscPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

    @Bean(name = "lonelyHeartsClubBand")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public CompactDisc randomBeatlesCD() {
        int choice = (int) Math.floor(Math.random() * 4);

        if (choice == 0) {
            return new SgtPeppers();
        } else if (choice == 1) {
            return new WhiteAlbum();
        } else if (choice == 2) {
            return new HardDaysNight();
        } else {
            return new Revolver();
        }
    }
}
