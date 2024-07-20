package com.divyanshu.kanban_task_management.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Board {
    private String id;
    private String name;
    private List<Column> columns;

    public Board() {
        this.id = UUID.randomUUID().toString();
    }
}
