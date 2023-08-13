package com.example.tasklistapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RESTController {
    @GetMapping("/tasks")
    public void getTask() {

    }

    @DeleteMapping("/tasks")
    public void deleteTask() {

    }

    @PostMapping("/tasks")
    public void addTask() {

    }

    @PutMapping("/tasks")
    public void updateTask() {

    }
}
