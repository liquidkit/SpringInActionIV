package pl.liquidkit.springinaction4.chapter04.aop;

import org.aspectj.lang.annotation.*;

/**
 * Created by Jacek on 2016-01-12.
 */
@Aspect
public class Audience {

    @Pointcut("execution(** pl.liquidkit.springinaction4.chapter04.aop.Performance.perform(..))")
    public void performance() {

    }

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Please silence your cell phones.");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Please take your seats.");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("Bravo!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Buu! Give my money back!");
    }
}
