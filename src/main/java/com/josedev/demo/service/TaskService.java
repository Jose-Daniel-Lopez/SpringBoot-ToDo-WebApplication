package com.josedev.demo.service;

import com.josedev.demo.entity.Task;
import com.josedev.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Transactional
    public void createTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    @Transactional
    public void deleteTask(Long theId){
        taskRepository.deleteById(theId);
    }

    @Transactional
    public void toggleTask(Long theId) {
        Task task = taskRepository.findById(theId).orElseThrow(() -> new IllegalArgumentException("Invalid task id"));

        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
    }
}
