package com.divyanshu.kanban_task_management.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Column {

    private String id;
    private String name;
    private List<Task> tasks;

    public Column() {
        this.id = UUID.randomUUID().toString();
    }
}

