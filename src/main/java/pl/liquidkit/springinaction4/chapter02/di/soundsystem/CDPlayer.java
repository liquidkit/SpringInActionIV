package pl.liquidkit.springinaction4.chapter02.di.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Jacek on 06.01.2016.
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc compactDisc;

//    @Autowired
//    public CDPlayer(CompactDisc compactDisc) {
//        this.compactDisc = compactDisc;
//    }

    @Autowired
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play() {
        compactDisc.play();
    }
}
