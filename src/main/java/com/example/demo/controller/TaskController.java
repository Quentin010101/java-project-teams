package com.example.demo.controller;

import com.example.demo.bean.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/task")
    public ResponseEntity<List<Task>> getTasks(){

        List<Task> list = taskService.getTasks();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
