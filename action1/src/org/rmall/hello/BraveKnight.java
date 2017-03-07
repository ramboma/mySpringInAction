package org.rmall.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Administrator on 2017/3/2.
 */
@Component
public class BraveKnight implements Knight {
    private String name;
    private Quest quest;
    public BraveKnight()
    {

    }
    public BraveKnight(Quest quest)
    {
        this.quest=quest;
        Random r=new Random();
        this.name= new Integer(r.nextInt()).toString();
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
