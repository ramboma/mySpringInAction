package org.rmall.action1;

import java.io.PrintStream;

/**
 * Created by Administrator on 2017/3/2.
 */
public class Minstrel {
    private PrintStream stream;
    public Minstrel(PrintStream stream)
    {
        this.stream=stream;
    }
    public void singBeforeQuest()
    {
        stream.println("fa la la ,the knight is so brave!");
    }
    public void singafterQuest()
    {
        stream.println("Tee hee hee ,the knight did embark on a quest!");
    }
}
