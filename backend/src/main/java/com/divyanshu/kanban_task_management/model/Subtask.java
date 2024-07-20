package com.divyanshu.kanban_task_management.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Subtask {

    private String id;
    private String name;
    private boolean completed;

    public Subtask() {
        this.id = UUID.randomUUID().toString();
    }
}
