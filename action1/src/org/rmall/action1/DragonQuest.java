package org.rmall.action1;

import org.springframework.stereotype.Component;

import java.io.PrintStream;

/**
 * Created by Administrator on 2017/3/2.
 */
@Component
public class DragonQuest implements Quest {
    private PrintStream stream;
    public DragonQuest(PrintStream stream)
    {
        this.stream=stream;
    }
    @Override
    public void doQuest() {
        stream.println("kill dragon quest!");
    }
}
