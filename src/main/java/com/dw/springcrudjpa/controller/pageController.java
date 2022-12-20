package com.dw.springcrudjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageController {

    @GetMapping("/login")
    public String loadLoginPage() {
        return "login";
    }
}
