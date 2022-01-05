package com.shra012.todo.controller;

import com.shra012.todo.model.Todo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {


    public List<Todo> listTodos() {
        return null;
    }



    public Todo updateTodo() {
        return null;
    }



    public ResponseEntity<?> insertTodo() {
        return null;
    }


    public Boolean deleteTodo(){
        return null;
    }

}
