package pl.liquidkit.springinaction4.chapter04.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Jacek on 2016-01-13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class ConcertConfigTest {
    @Autowired
    private EncoreableIntroducer encoreableIntroducer;

    @Test
    public void testEncoreableIntroducer() throws Exception {
//        encoreableIntroducer.encoreable.performEncore();
    }
}