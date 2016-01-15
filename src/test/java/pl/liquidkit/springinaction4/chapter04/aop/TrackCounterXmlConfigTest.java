package pl.liquidkit.springinaction4.chapter04.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.liquidkit.springinaction4.chapter02.di.soundsystem.CompactDisc;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jacek on 2016-01-15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans-aop-config.xml")
public class TrackCounterXmlConfigTest {
    @Autowired
    private CompactDisc blankDisc;
    @Autowired
    private TrackCounterNoAspect trackCounterNoAspect;

    @Test
    public void trackCounterTest() {
        trackCounterNoAspect.trackCount(1);
        assertEquals(1, trackCounterNoAspect.getPlayCount(1));

        blankDisc.playTrack(2);
        blankDisc.playTrack(2);
        blankDisc.playTrack(2);
        assertEquals(3, trackCounterNoAspect.getPlayCount(2));
    }
}
