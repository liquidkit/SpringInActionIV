package pl.liquidkit.springinaction4.chapter04.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pl.liquidkit.springinaction4.chapter02.di.soundsystem.BlankDisc;
import pl.liquidkit.springinaction4.chapter02.di.soundsystem.CompactDisc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jacek on 2016-01-13.
 */
@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
    @Bean
    public CompactDisc blankDisc() {
//        BlankDisc blankDisc = new BlankDisc();
//
//        blankDisc.setTitle("Some extra title");
//        blankDisc.setArtist("Some extra artist");
//
//        List<String> tracks = new ArrayList<String>();
//        tracks.add("Track 1");
//        tracks.add("Track 2");
//        tracks.add("Track 3");
//        tracks.add("Track 4");
//
//        blankDisc.setTracks(tracks);
//
//        return blankDisc;
        return new BlankDisc();
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
