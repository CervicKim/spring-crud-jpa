package com.dw.springcrudjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class memberController {

    // @Autowired

    // 전체조회
    @GetMapping("/ok")

    public String starts() {
        return "I am Ok";
    }
}
