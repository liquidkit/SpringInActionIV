package pl.liquidkit.springinaction4.chapter04.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jacek on 2016-01-15.
 */
public class TrackCounterNoAspect {
    private Map<Integer, Integer> tracksCount = new HashMap<Integer, Integer>();

    public void trackCount(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        tracksCount.put(trackNumber, currentCount + 1);
        System.out.println("XML: Track counting...");
    }

    public int getPlayCount(int trackNumber) {
        return tracksCount.containsKey(trackNumber) ? tracksCount.get(trackNumber) : 0;
    }
}
