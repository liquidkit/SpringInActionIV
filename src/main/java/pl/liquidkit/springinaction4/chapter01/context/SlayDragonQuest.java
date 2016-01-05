package pl.liquidkit.springinaction4.chapter01.context;

import java.io.PrintStream;

/**
 * Created by Jacek on 2016-01-05.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
