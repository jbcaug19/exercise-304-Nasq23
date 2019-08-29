package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class TODO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 10)
    private String title;

    @NotNull
    @Size(min = 10)
    private String taskname;

    @NotNull
    @Size(min = 10)
    private int duedate;

    @NotNull
    @Size(min = 10)
    private int prioritys;


    public TODO() {
    }

    public TODO(@NotNull @Size(min = 10) String title, @NotNull @Size(min = 10) String taskname, @NotNull @Size(min = 10) int duedate, @NotNull @Size(min = 10) int prioritys) {
        this.title = title;
        this.taskname = taskname;
        this.duedate = duedate;
        this.prioritys = prioritys;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public int getDuedate() {
        return duedate;
    }

    public void setDuedate(int duedate) {
        this.duedate = duedate;
    }

    public int getPrioritys() {
        return prioritys;
    }

    public void setPrioritys(int prioritys) {
        this.prioritys = prioritys;
    }
}