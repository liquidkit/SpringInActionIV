package pl.liquidkit.springinaction4.chapter02.di.soundsystem;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * Created by Jacek on 06.01.2016.
 */
public class BlankDisc implements CompactDisc {
    @Value("${disc.title}")
    private String title;
    @Value("${disc.artist}")
    private String artist;
    private List<String> tracks;

//    public BlankDisc(String title, String artist, List<String> tracks) {
//        this.title = title;
//        this.artist = artist;
//        this.tracks = tracks;
//    }

    public BlankDisc() {
    }

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public void play() {
        System.out.print("Playing record: " + title + " artist " + artist);

        if (tracks != null && tracks.size() > 0) {
            for (String track : tracks) {
                System.out.println("-Track: " + track);
            }
        }
    }
}
