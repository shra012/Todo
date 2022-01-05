package com.shra012.todo.repository;

import com.shra012.todo.model.Todo;

import java.util.List;

public interface TodoRepository {
    Integer saveToDo(Todo todo);
    List<Todo> getAllToDos();
    Todo updateToDo(Todo id);
    boolean removeToDo(Integer id);
}
