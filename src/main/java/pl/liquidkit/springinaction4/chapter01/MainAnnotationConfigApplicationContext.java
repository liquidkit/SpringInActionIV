package pl.liquidkit.springinaction4.chapter01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Jacek on 2016-01-05.
 */
public class MainAnnotationConfigApplicationContext {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = (Knight) applicationContext.getBean("knight");
        knight.embarkOnQuest();
    }
}
