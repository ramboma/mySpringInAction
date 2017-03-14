package org.rmall.action5.controller;

import org.rmall.action5.IProductManager;
import org.rmall.action5.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by Administrator on 2017-03-13.
 */
@Controller
public class FirstController {
    @Autowired
    private IProductManager productManager;

    @RequestMapping(value="/first",method= RequestMethod.GET)
    public String first(Model model)
    {
       product p=productManager.showMaxProduct();
        model.addAttribute("product",p);
        return "first";
    }
    @RequestMapping(value="/home",method=RequestMethod.GET)
    public String home()
    {
        return "first";
    }
}
