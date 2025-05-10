package com.josedev.demo.controller;

import com.josedev.demo.entity.Task;
import com.josedev.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/showAll")
    public String getTasks(Model model){
        List<Task> tasks = taskService.getAllTasks();
        long completedCount = tasks.stream().filter(Task::isCompleted).count();
        long incompletedCount = tasks.size() - completedCount;

        model.addAttribute("tasks", tasks);
        model.addAttribute("completedCount", completedCount);
        model.addAttribute("incompletedCount", incompletedCount);
        return "/tasks";
    }

    @PostMapping
    public String createTask(@RequestParam String title){
        taskService.createTask(title);

        return "redirect:/tasks/showAll";
    }

    @GetMapping("{id}/delete")
    public String deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);

        return "redirect:/tasks/showAll";
    }

    @PostMapping("{id}/toggle")
    public String toggleTask(@PathVariable Long id){
        taskService.toggleTask(id);

        return "redirect:/tasks/showAll";
    }
}
