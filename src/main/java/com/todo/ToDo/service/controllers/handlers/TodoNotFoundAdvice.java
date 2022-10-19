package com.todo.ToDo.service.controllers.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.todo.ToDo.service.controllers.exceptions.TodoNotFoundException;

@ControllerAdvice
public class TodoNotFoundAdvice {
	
	@ResponseBody
	@ExceptionHandler(TodoNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String todoNotFoundHandler(TodoNotFoundException ex) {
		return ex.getMessage();
	}
}
