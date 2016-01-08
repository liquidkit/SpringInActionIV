package pl.liquidkit.springinaction4.chapter03.unique.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Jacek on 2016-01-08.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class DessertConfigTest {
    @Autowired
//    @Qualifier("iceCream")
    @Cold
    @Creamy
    private Dessert dessert;

//    public void setDessert(Dessert dessert) {
//        this.dessert = dessert;
//    }

    @Test
    public void test() {
    }
}