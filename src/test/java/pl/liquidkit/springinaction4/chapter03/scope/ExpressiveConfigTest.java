package pl.liquidkit.springinaction4.chapter03.scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.liquidkit.springinaction4.chapter02.di.soundsystem.BlankDisc;

import static org.junit.Assert.*;

/**
 * Created by Jacek on 2016-01-11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfig.class)
public class ExpressiveConfigTest {
    @Autowired
    private BlankDisc disc;
    @Autowired
    private BlankDisc sgtPeppers;

    @Test
    public void testDiscJavaConfig() throws Exception {
        System.out.println("#### testDiscJavaConfig");
        disc.play();
        System.out.println();
    }

    @Test
    public void testDiscXmlConfig() throws Exception {
        System.out.println("#### testDiscXmlConfig");
        sgtPeppers.play();
        System.out.println();
    }
}