package org.rmall.action1;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Administrator on 2017/3/6.
 */
public class watchqeustid {
    public void watchQuest(ProceedingJoinPoint joinpoint)
    {
        try

        {
            System.out.println("the watch quest aspect begin...");
            long start = System.currentTimeMillis();
            joinpoint.proceed();

            long end = System.currentTimeMillis();
            System.out.println("process took " + (end - start) + " milliseconds.");
        }
        catch(Throwable t)
        {
            System.out.println(t.getMessage());
        }
    }
}
