package com.example.tasklistapi.model;

import com.example.tasklistapi.form.TaskForm;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Task implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String description;

    private boolean hasDone;

    private Long ownerId;

    public Task(TaskForm form) {
        this.description = form.getDescription();
    }

    public Task() {

    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHasDone() {
        return hasDone;
    }

    public void setHasDone(boolean hasDone) {
        this.hasDone = hasDone;
    }

    public Long getOwnerId() {
        return ownerId;
    }
}
