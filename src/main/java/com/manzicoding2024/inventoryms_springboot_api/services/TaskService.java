package com.manzicoding2024.inventoryms_springboot_api.services;

//import com.kindson.inventoryappspringbootapi.models.Task;
//import com.kindson.inventoryappspringbootapi.repositories.TaskRepository;
import com.manzicoding2024.inventoryms_springboot_api.models.Task;
import com.manzicoding2024.inventoryms_springboot_api.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}

