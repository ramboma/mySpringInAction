package org.rmall.hello.action2;

import org.rmall.hello.action2.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/3/2.
 */
public class SgtPeppers implements CompactDisc {
    private String title="haha ,another inject!";
    public void play() {
       System.out.println(title);
    }
}
