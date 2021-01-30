package com.labencki.education.controllersdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("users")
public class MyMvcController {

    @GetMapping
    String handleUsers(@RequestParam("user") String user, Model model) {
        System.out.println("Handle Users");
        List<String> nowaLista = new ArrayList<>();
        for(int i=0;i<5;i++) {
            nowaLista.add(user);

        }
        model.addAttribute("nowaLista",nowaLista);
        return "hello";

    }



}
