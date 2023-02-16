package com.board.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class boardcontroller {
    @GetMapping("/")
    @ResponseBody
    public static String main(String[] args) {

        return "helloworld";
    }
}
