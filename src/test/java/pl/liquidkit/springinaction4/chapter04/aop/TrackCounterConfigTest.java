package pl.liquidkit.springinaction4.chapter04.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.liquidkit.springinaction4.chapter02.di.soundsystem.BlankDisc;
import pl.liquidkit.springinaction4.chapter02.di.soundsystem.CompactDisc;

import static org.junit.Assert.*;

/**
 * Created by Jacek on 2016-01-13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterConfigTest {
    @Autowired
    private CompactDisc blankDisc;
    @Autowired
    private TrackCounter trackCounter;

    @Test
    public void testTrackCount() throws Exception {
        blankDisc.playTrack(1);
        assertEquals(1, trackCounter.getPlayCount(1));

        blankDisc.playTrack(3);
        blankDisc.playTrack(3);
        blankDisc.playTrack(3);
        assertEquals(3, trackCounter.getPlayCount(3));
    }
}