package pl.liquidkit.springinaction4.chapter04.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by Jacek on 2016-01-13.
 */
@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "pl.liquidkit.springinaction4.chapter04.aop.Performance+",
            defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
