package com.example.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ToDoController {

    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tasks", toDoService.getAllTasks());
        return "index";
    }

    @PostMapping("/add")
    public String addTask(@RequestParam String title, @RequestParam String description) {
        toDoService.addTask(title, description);
        return "redirect:/";
    }

    @PostMapping("/remove")
    public String removeTask(@RequestParam int id) {
        toDoService.removeTask(id);
        return "redirect:/";
    }

    @PostMapping("/edit")
    public String editTask(@RequestParam int id, @RequestParam String title, @RequestParam String description) {
        toDoService.editTask(id, title, description);
        return "redirect:/";
    }

    @PostMapping("/toggle")
    public String toggleTask(@RequestParam int id) {
        toDoService.toggleTask(id);
        return "redirect:/";
    }
}