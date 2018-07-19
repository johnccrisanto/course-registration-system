package com.johncrisanto.courseregsystem.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String showHomePage(Principal principal) {
        System.out.println(principal.getName());
        return "home";
    }






}
