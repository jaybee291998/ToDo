package com.todo.ToDo.service.controllers.exceptions;

public class TodoNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4285314166974798934L;
	
	TodoNotFoundException(long id){
		super("Could not find task with id " + id);
	}
}
