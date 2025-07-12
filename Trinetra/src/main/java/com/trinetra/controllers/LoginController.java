package com.trinetra.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

    @GetMapping("/")
    public String login() {
        return "login"; // This maps to login.html in the templates folder
    }
    @GetMapping("/login")
    public String login2() {
        return "login"; // This maps to login.html in the templates folder
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); // Destroy session
        return "redirect:/login"; // Redirect to login page
    }
}
