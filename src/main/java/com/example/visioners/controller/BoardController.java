package com.example.visioners.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

    @GetMapping("/") // '/' 경로로 들어왔을 때 responseBody 글자를 그대로 띄워줄 수 있는 어노테이션
    @ResponseBody
    public String main() {

        return "Hello World!";
    }
}