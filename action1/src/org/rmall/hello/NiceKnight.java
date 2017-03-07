package org.rmall.hello;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Administrator on 2017/3/2.
 */
@Component
public class NiceKnight implements Knight {
    private String name;
    private Quest quest;
    public NiceKnight()
    {

    }
    public NiceKnight(Quest quest)
    {
        this.quest=quest;
        this.name= "nice";
    }
    @Override
    public void embarkOnQuest() {
       quest.doQuest();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
