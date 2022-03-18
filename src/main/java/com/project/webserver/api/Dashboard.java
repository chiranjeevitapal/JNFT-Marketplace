package com.project.webserver.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
@CrossOrigin(origins = "http://localhost:4200")
public class Dashboard {
    @RequestMapping("/")
    public String dashboard() {
        return "index.html";
    }
}
