package com.example.demo.service;

import com.example.demo.bean.Task;
import com.example.demo.exception.TaskNotFoundException;
import com.example.demo.repository.TaskRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<Task> getTasks(){
        return taskRepository.findAll();
    }

    public Task saveTask(Task newTask){
        return taskRepository.save(newTask);
    }

    public Task updateTask(Task newTask,Long id){
        Optional<Task> optionalTask = taskRepository.findById(id);

        if(optionalTask.isEmpty()) throw new TaskNotFoundException("Task does not exist.");

        Task existingTask = optionalTask.get();
        modelMapper.map(newTask, existingTask);
        return taskRepository.save(existingTask);

    }
}
