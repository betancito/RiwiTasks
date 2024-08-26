package com.riwi.Tasks.service;

import com.riwi.Tasks.entity.taskModel;

import java.util.List;


public interface taskService {

    public List<taskModel> listTasks();

    public taskModel saveTask(taskModel task);

    public taskModel findByid(Long id);

    public taskModel updateTask(taskModel task);

    public void deleteTask(Long id);
}
