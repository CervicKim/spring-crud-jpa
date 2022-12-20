package com.dw.springcrudjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class memberController {

    // @Autowired

    // 전체조회
    @GetMapping("/index")
    public List<dw_index> callAllindex() {
        return repo.findAll();
    }

    // 추가
    @PostMapping("/index")
    public index callsaveIndex(@RequestBody index index) {
        // save == insert
        index = repo.save(member);
        return member;
    }

    // 삭제
    @DeleteMapping("/index/{id}")
    public boolean callDeleteIndex(@PathVariable long id) {
        //deleteById == delete
        //By == where
        try{
            repo.deleteById(id)
        }
    }
}
