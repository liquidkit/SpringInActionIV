package pl.liquidkit.springinaction4.chapter01.aop;

import java.io.PrintStream;

/**
 * Created by Jacek on 2016-01-05.
 */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("Tra la la; What a brave knight!");
    }

    public void signAfterQuest() {
        stream.println("Hip hip hurray; Brave knight accomplished mission! ");
    }
}
