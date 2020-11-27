package com.example.lesson;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LayoutController {
    @RequestMapping("/layout")
    public String layout(){
        return "layout";
    }
}
