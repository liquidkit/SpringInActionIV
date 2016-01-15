package pl.liquidkit.springinaction4.chapter04.aop;

/**
 * Created by Jacek on 2016-01-15.
 */
public class CriticAspect {
    private CriticismEngine criticismEngine;

    public CriticAspect() {
    }

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}
