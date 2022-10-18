package com.todo.ToDo.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.ToDo.data.entities.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
