package com.labencki.education.controllersdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("MyRestController")
public class MyRestController {

    @GetMapping("{name}")
    String getNameViaRest(@PathVariable(name = "name") String name) {
        return "Hello " + name;


    }

    @PostMapping
    List<String> addUsersToModal(@RequestBody List<String> users) {
        System.out.println("adding users to modal".toUpperCase());
        List<String> nowaLista = new ArrayList<>();
        for (String user : users) {
            nowaLista.add(user.toUpperCase());
        }

        return nowaLista;


//        return users;
    }


}
