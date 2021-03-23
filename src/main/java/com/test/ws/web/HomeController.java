package com.test.ws.web;

import com.test.ws.service.bbsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    @Resource(name="bbsService")
    private bbsService service;

    @RequestMapping(value = "/")
    public String home(Model model){
        List<Map> list = service.list();
        System.out.println("list:"+list.size());
        model.addAttribute("msg","Hello World");
        return "index.tiles";
    }
}
