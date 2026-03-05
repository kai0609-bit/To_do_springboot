package com.example.todo;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ToDoService {

    private final ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDoItem> getAllTasks() {
        return toDoRepository.findAll();
    }
    
    public void addTask(String title, String description) {
        ToDoItem item = new ToDoItem(title, description);
        toDoRepository.save(item);
    }

    public void removeTask(int id) {
        toDoRepository.deleteById(id);
    }

    public void editTask(int id, String newTitle, String newDescription) {
        ToDoItem item = toDoRepository.findById(id).orElse(null);
        if (item != null) {
            item.setTitle(newTitle);
            item.setDescription(newDescription);
            toDoRepository.save(item);
        }
    }

    public void toggleTask(int id) {
        ToDoItem item = toDoRepository.findById(id).orElse(null);
        if (item != null) {
            item.setCompleted(!item.isCompleted());
            toDoRepository.save(item);
        }
    }
}