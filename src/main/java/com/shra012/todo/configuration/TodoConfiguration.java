package com.shra012.todo.configuration;

import com.shra012.todo.repository.TodoInMemoryRepository;
import com.shra012.todo.repository.TodoRepository;
import com.shra012.todo.service.TodoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoConfiguration {

    @Bean
    public TodoRepository todoRepository(){
        return new TodoInMemoryRepository();
    }

    @Bean
    public TodoService todoService(TodoRepository todoRepository){
        return new TodoService(todoRepository);
    }
}
