package com.divyanshu.kanban_task_management.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Task {
    private String id;
    private String title;
    private String description;
    private String status;
    private List<Subtask> subtasks;

    public Task() {
        this.id = UUID.randomUUID().toString();
    }
}
