package com.todo.ToDo.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.ToDo.data.entities.Todo;

interface TodoRepository extends JpaRepository<Todo, Long>{

}
