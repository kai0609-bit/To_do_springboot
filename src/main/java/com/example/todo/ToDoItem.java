package com.example.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ToDoItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private boolean isCompleted;

    // Constructors
    public ToDoItem() {}

    public ToDoItem(String title, String description) {
        this.title = title;
        this.description = description;
        this.isCompleted = false;
    }

    // Getters
    public int getId() {return id; }
    public String getTitle() {return title; }
    public String getDescription() {return description; }
    public boolean isCompleted() {return isCompleted; }

    // Setters
    public void setTitle(String title) {this.title = title; }
    public void setDescription(String description) {this.description = description; }
    public void setCompleted(boolean isCompleted) {this.isCompleted = isCompleted; }
}
