package com.trinetra.controllers;

import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeControllar {
   // @PreAuthorize("hasRole('USER')")
   @GetMapping("/normal")
    public ResponseEntity<String> normalUser(){
        return ResponseEntity.ok("Yes: I am normal User");
    }
     // @PreAuthorize("hasRole('ADMIN')")
   @GetMapping("/admin")
    public ResponseEntity<String> adminUser(){
        return ResponseEntity.ok("Yes: I am admin User");
    }
   // @PreAuthorize("hasRole('ADMIN''USER')")

     @GetMapping("/public")
    public ResponseEntity<String> publicUser(){
        return ResponseEntity.ok("Yes: I am public User");
    }
}
