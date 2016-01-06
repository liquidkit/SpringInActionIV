package pl.liquidkit.springinaction4.chapter02.di.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by Jacek on 06.01.2016.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing record: " + title + " artist " + artist);
    }
}
