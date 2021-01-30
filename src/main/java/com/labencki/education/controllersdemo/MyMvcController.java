package com.labencki.education.controllersdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("MyMvcController")
public class MyMvcController {

    @GetMapping
    String getNameViaMvc(@RequestParam(name = "imie") String name) {
        return "hello";
    }


}
