package pl.liquidkit.springinaction4.chapter04.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jacek on 2016-01-13.
 */
@Aspect
public class TrackCounter {
    private Map<Integer, Integer> tracksCount = new HashMap<Integer, Integer>();

    @Pointcut("execution(* pl.liquidkit.springinaction4.chapter02.di.soundsystem.CompactDisc.playTrack(int)) " +
            "&& args(trackNumber)")
    public void trackPlayed(int trackNumber) {
    }

    @Before("trackPlayed(trackNumber)")
    public void trackCount(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        tracksCount.put(trackNumber, currentCount + 1);
        System.out.println("Track counting...");
    }

    public int getPlayCount(int trackNumber) {
        return tracksCount.containsKey(trackNumber) ? tracksCount.get(trackNumber) : 0;
    }
}
