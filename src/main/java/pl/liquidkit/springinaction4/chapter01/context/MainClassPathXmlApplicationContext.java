package pl.liquidkit.springinaction4.chapter01.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jacek on 2016-01-04.
 */
public class MainClassPathXmlApplicationContext {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("knight.xml");
        Knight knight = (Knight) applicationContext.getBean("knight");
        knight.embarkOnQuest();
    }
}
