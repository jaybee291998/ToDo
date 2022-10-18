package com.todo.ToDo.service.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.ToDo.data.entities.Todo;
import com.todo.ToDo.data.repositories.TodoRepository;
@RestController
public class TodoController {
	
		private final TodoRepository repository;
		
		public TodoController(TodoRepository repository) {
			this.repository = repository;
		}
		
		@GetMapping("/todo")
		List<Todo> all(){
			return repository.findAll();
		}
}
