package com.riwi.Tasks.controller;

import com.riwi.Tasks.service.taskService;
import com.riwi.Tasks.entity.taskModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.ui.Model;

@Controller
public class taskController {
    @Autowired
    private taskService taskService;

    @GetMapping({"/tasks","/"})
    public String listTasks(Model model){
        model.addAttribute("tasks", taskService.listTasks());
        return "tasks"; //Return the tasks
    }

    @GetMapping({"tasks/new", "/new"})
    public String newTaskForm(Model model) {
        taskModel task = new taskModel();
        model.addAttribute("task", task);
        return "new_task";
    }

    @PostMapping("/tasks")
    public String saveTask(@ModelAttribute("task")taskModel task){
        task.setDateCreated(LocalDate.now());
        task.setHourCreated(LocalTime.now());
        taskService.saveTask(task);
        return "redirect:/tasks";
    }

    @GetMapping("/tasks/edit/{id}")
    public String updateForm(@PathVariable Long id, Model model){
        model.addAttribute("task", taskService.findByid(id));
        return "edit_task";
    }

    @PostMapping("/tasks/{id}")
    public String updateTask(@PathVariable Long id, @ModelAttribute("task") taskModel task, Model model) {
        taskModel existentTask = taskService.findByid(id);
        existentTask.setId(id);
        existentTask.setTitle(task.getTitle());
        existentTask.setDescription(task.getDescription());
        existentTask.setHourCreated(LocalTime.now());
        existentTask.setDateCreated(LocalDate.now());
        existentTask.setState(task.getState());
        taskService.updateTask(existentTask);
        return "redirect:/tasks";
    }

    @GetMapping("/tasks/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        taskService.deleteTask(id);
        return "redirect:/tasks";
    }
}

