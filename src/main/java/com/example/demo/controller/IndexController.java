package com.example.demo.controller;

//import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

//import javax.annotation.processing.Generated;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){return "index";}

    }

