package org.rmall.action4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Administrator on 2017/3/8.
 */
@Controller
public class HomeController {

    public HomeController()
    {

    }
    @RequestMapping({"/","/home"})
    public String showHomePage(Map<String,Object> model)
    {
        model.put("action",10);
        return "nagivate/first";
    }
}
