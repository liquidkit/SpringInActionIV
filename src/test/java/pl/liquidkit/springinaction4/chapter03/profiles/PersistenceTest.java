package pl.liquidkit.springinaction4.chapter03.profiles;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Jacek on 2016-01-08.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PersistenceTestConfig.class)
@ActiveProfiles("dev")
public class PersistenceTest {
    @Test
    public void test() {

    }
}
