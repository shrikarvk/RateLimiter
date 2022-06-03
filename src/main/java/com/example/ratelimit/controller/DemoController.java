package com.example.ratelimit.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin
public class DemoController {
    @GetMapping("/demo")
    public ResponseEntity<Object> demo(HttpServletRequest request) {
        return ResponseEntity.ok("Success");
    }
}
