package com.example.tasklistapi.service;

import com.example.tasklistapi.form.TaskForm;
import com.example.tasklistapi.model.Task;
import com.example.tasklistapi.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    TaskRepository taskRepository;

    public void TaskAdd(TaskForm task) {
        taskRepository.save(new Task(task));
    }

    public void TaskUpdate(Task task) {
        taskRepository.save(task);
    }

    public void TaskDelete(Task task) {
        taskRepository.deleteById(task.getId());
    }

    public void GetTask(Long id) {
        taskRepository.findById(id);
    }

    public void GetAllTask(Long ownerId) {
        taskRepository.findAllUserTasks(ownerId);
    }
}
