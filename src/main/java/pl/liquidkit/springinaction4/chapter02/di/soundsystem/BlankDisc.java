package pl.liquidkit.springinaction4.chapter02.di.soundsystem;

import java.util.List;

/**
 * Created by Jacek on 06.01.2016.
 */
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        System.out.print("Playing record: " + title + " artist " + artist);

        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }
}
