package com.shra012.todo.model;

import lombok.Data;

@Data
public class Todo {
    private Integer id;
    private String message;
    private boolean done;
}
