package com.genspark.SpringSecurityProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class MyController {

    @GetMapping("/public")
    public String publicUser() {
        return "Welcome Public User";
    }

    @GetMapping("/admin")
    public String adminUser() {
        return "Welcome administrator";
    }

    @GetMapping("/normal")
    public String normalUser() {
        return "Welcome Normal User";
    }

}