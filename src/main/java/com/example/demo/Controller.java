package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zslin on 2019/8/27.
 */
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
