package pl.liquidkit.springinaction4.chapter04.aop;

/**
 * Created by Jacek on 2016-01-13.
 */
public class DefaultEncoreable implements Encoreable {
    public void performEncore() {
        System.out.println("Encore, Encore!");
    }
}
