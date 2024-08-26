package com.riwi.Tasks.service;

import com.riwi.Tasks.entity.taskModel;
import com.riwi.Tasks.repository.iTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class taskImpl implements  taskService{
    @Autowired
    iTask taskRepository;

    @Override
    public List<taskModel> listTasks() {
        return taskRepository.findAll();
    }

    @Override
    public taskModel saveTask(taskModel task) {
        return taskRepository.save(task);
    }

    @Override
    public taskModel findByid(Long id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public taskModel updateTask(taskModel task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }


}
