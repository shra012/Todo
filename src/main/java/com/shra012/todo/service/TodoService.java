package com.shra012.todo.service;

import com.shra012.todo.model.Todo;
import com.shra012.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;


@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public Integer saveToDo(Todo todo) {
        return todoRepository.saveToDo(todo);
    }

    public List<Todo> getAllToDos() {
        return todoRepository.getAllToDos();
    }

    public Todo updateToDo(Todo todo) {
        return todoRepository.updateToDo(todo);
    }

    public boolean removeToDo(Integer id) {
        return todoRepository.removeToDo(id);
    }

}
