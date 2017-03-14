package org.rmall.action2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by Administrator on 2017-03-13.
 */
public class test {
    @Autowired
    private MediaPlayer player;
    public void play()
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        player=ctx.getBean(MediaPlayer.class);
        player.play();
    }
}
