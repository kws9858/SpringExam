package com.test.ws.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(Model model){
        System.out.println("여기 들어오니?");

        model.addAttribute("msg","Hello World");
        return "index.tiles";
    }
}
