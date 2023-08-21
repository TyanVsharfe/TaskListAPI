package com.example.tasklistapi.repository;

import com.example.tasklistapi.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
    public default List<Task> findAllUserTasks(Long ownerId) {
        Iterable<Task> tasks = findAll();
        List<Task> result = new ArrayList<>();
        tasks.forEach(task -> { if (task.getOwnerId().equals(ownerId))
            result.add(task);
        });
        return result;
    }
}
