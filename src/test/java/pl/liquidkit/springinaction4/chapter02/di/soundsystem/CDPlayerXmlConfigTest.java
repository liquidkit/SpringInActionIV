package pl.liquidkit.springinaction4.chapter02.di.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Jacek on 06.01.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans-config.xml")
//@ImportResource("classpath:beans-config.xml")
public class CDPlayerXmlConfigTest {
    @Autowired
    private CDPlayer cdPlayer;
    @Autowired
    private CompactDisc compactDiscBlank;

    @Test
    public void someMethod() {
        compactDiscBlank.play();
    }
}
