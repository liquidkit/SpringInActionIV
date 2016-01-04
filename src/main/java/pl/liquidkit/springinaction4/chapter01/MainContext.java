package pl.liquidkit.springinaction4.chapter01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jacek on 2016-01-04.
 */
public class MainContext {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("knight.xml");
    }
}
