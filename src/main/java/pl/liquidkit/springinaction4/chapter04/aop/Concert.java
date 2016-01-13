package pl.liquidkit.springinaction4.chapter04.aop;

/**
 * Created by Jacek on 2016-01-13.
 */
public class Concert implements Performance {
    public void perform() {
        System.out.println("Perform - Concert!");
    }
}
