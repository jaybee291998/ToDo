package com.todo.ToDo.data.entities;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Todo {
	
	private @Id @GeneratedValue Long id;
	private String body;
	private boolean isDone;
	private Timestamp creationDatetime;
	
	public Todo() {
		
	}

	public Todo(String body, boolean isDone, Timestamp creationDatetime) {
		this.body = body;
		this.isDone = isDone;
		this.creationDatetime = creationDatetime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	public Timestamp getCreationDatetime() {
		return creationDatetime;
	}

	public void setCreationDatetime(Timestamp creationDatetime) {
		this.creationDatetime = creationDatetime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + ((creationDatetime == null) ? 0 : creationDatetime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isDone ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (creationDatetime == null) {
			if (other.creationDatetime != null)
				return false;
		} else if (!creationDatetime.equals(other.creationDatetime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isDone != other.isDone)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", body=" + body + ", isDone=" + isDone + ", creationDatetime=" + creationDatetime
				+ "]";
	}
	
	
	
	
	
}
