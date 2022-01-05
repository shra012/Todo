package com.shra012.todo.repository;

import com.shra012.todo.model.Todo;

import java.util.ArrayList;
import java.util.List;

public class TodoInMemoryRepository implements TodoRepository {
    private final List<Todo> todos = new ArrayList<>();

    @Override
    public Integer saveToDo(Todo todo) {
        todo.setId(todos.size() + 1);
        todos.add(todo);
        return todo.getId();
    }

    @Override
    public List<Todo> getAllToDos() {
        return todos;
    }

    @Override
    public Todo updateToDo(Todo todo) {
        Todo todoToUpdate = todos.stream().filter(availableTodo -> availableTodo.getId().equals(todo.getId())).findFirst().orElseThrow();
        todoToUpdate.setDone(todo.isDone());
        todoToUpdate.setMessage(todo.getMessage());
        return todoToUpdate;
    }

    @Override
    public boolean removeToDo(Integer id) {
        return todos.removeIf(todo -> todo.getId().equals(id));
    }
}
