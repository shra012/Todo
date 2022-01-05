package com.shra012.todo.controller;

import com.shra012.todo.model.Todo;
import com.shra012.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    public TodoService todoService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Todo> listTodos() {
        return todoService.getAllToDos();
    }


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Todo updateTodo(@RequestBody Todo todo) {
        return todoService.updateToDo(todo);
    }


    @PutMapping()
    public ResponseEntity<?> insertTodo(@RequestBody Todo todo) {
        Integer id = todoService.saveToDo(todo);
        return ResponseEntity.created(URI.create("/todo/" + id)).build();
    }

    @DeleteMapping(value = "/{id}")
    public boolean deleteTodo(@PathVariable Integer id){
        return todoService.removeToDo(id);
    }

}
