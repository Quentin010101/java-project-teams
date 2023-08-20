package com.example.demo.controller;

import com.example.demo.bean.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("")
    public ResponseEntity<List<Task>> getTasks(){

        List<Task> list = taskService.getTasks();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Task> create(@RequestBody Task newTask){

        Task savedTask = taskService.saveTask(newTask);
        return new ResponseEntity<>(savedTask, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Task> update(@RequestBody Task newTask, @PathVariable Long id){

        Task updatedTask = taskService.updateTask(newTask, id);
        return new ResponseEntity<>(updatedTask, HttpStatus.OK);
    }
}
