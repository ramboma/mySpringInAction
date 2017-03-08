import org.rmall.action1.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2017/3/2.
 */
public class main {
    public static void main(String[] args)
    {
        int a=0;
       do
       {
           try {
               a = System.in.read();
               setup();
           }
           catch (IOException e)
           {
               e.printStackTrace();
           }
       }while(a!=97);

    }
    private static void setup()
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        Knight knight1=context.getBean(Knight.class);
        Knight knight2=context.getBean(Knight.class);
        knight1.embarkOnQuest();
        System.out.println(knight1.getName());
        knight2.embarkOnQuest();
        System.out.println(knight2.getName());

    }
}
