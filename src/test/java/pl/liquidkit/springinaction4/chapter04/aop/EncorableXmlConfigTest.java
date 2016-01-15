package pl.liquidkit.springinaction4.chapter04.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Jacek on 2016-01-15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans-aop-config.xml")
public class EncorableXmlConfigTest {
    @Autowired
    private Performance concert;
    @Autowired
    private Encoreable encorableDelegate;

    @Test
    public void encoreTest() {
//        concert.perform();

        encorableDelegate.performEncore();
    }
}
