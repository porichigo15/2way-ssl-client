package com.example.client.controller;

import com.example.client.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/call-server")
    public ResponseEntity<String> callServer() {
        String result = homeService.callServer();
        return ResponseEntity.ok(result);
    }
}
