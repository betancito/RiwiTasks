package com.riwi.Tasks.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "task")
public class taskModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 255, nullable = true)
    private String description;

    @Column(nullable = false)
    private LocalDate dateCreated;

    @Column(nullable = false)
    private LocalTime hourCreated;

    @Column(length = 50, nullable = false)
    private String state;

//Empty constructor
    public taskModel() {
    }

//Full constructor
    public taskModel(Long id, String title, String description, LocalDate dateCreated, LocalTime hourCreated, String state) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateCreated = dateCreated;
        this.hourCreated = hourCreated;
        this.state = state;
    }

//Constructor without id
public taskModel(String title, String description, LocalDate dateCreated, LocalTime hourCreated, String state) {
    this.title = title;
    this.description = description;
    this.dateCreated = dateCreated;
    this.hourCreated = hourCreated;
    this.state = state;
}

//getters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public LocalTime getHourCreated() {
        return hourCreated;
    }

    public String getState() {
        return state;
    }

//Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setHourCreated(LocalTime hourCreated) {
        this.hourCreated = hourCreated;
    }

    public void setState(String state) {
        this.state = state;
    }

//toString
    @Override
    public String toString() {
        return "||task |" + " id=" + id + "  |title='" + title + " |description='" + description + "  |dateCreated=" + dateCreated + "  |hourCreated=" + hourCreated + "  |state='" + state +"|| \n";
    }
}
