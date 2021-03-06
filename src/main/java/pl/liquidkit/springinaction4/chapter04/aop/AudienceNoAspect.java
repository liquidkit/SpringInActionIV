package pl.liquidkit.springinaction4.chapter04.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by Jacek on 2016-01-12.
 */
public class AudienceNoAspect {

    public void silenceCellPhones() {
        System.out.println("XML: Please silence your cell phones.");
    }

    public void takeSeats() {
        System.out.println("XML: Please take your seats.");
    }

    public void applause() {
        System.out.println("XML: Bravo!");
    }

    public void demandRefund() {
        System.out.println("XML: Buu! Give my money back!");
    }

    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Please silence your cell phones.");
            System.out.println("Please take your seats.");

            jp.proceed();

            System.out.println("Bravo!");
        } catch (Throwable e) {
            System.out.println("Buu! Give my money back!");
        }
    }

}
