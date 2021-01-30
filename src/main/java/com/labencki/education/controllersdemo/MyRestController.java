package com.labencki.education.controllersdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("MyRestController")
public class MyRestController {

    @GetMapping("{name}")
    String getNameViaRest(@PathVariable(name="name") String name) {
        return "Hello " + name;
    }




}
