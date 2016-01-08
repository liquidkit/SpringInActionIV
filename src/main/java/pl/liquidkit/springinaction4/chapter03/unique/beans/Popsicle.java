package pl.liquidkit.springinaction4.chapter03.unique.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Jacek on 2016-01-08.
 */
@Component
//@Qualifier("cold")
@Cold
@Fruity
public class Popsicle implements Dessert {
}
