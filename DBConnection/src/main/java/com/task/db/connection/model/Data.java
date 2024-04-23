package com.task.db.connection.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Data {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int parentId;
	private String name;
	private String color;
	
	public Data(int id, int parentId, String name, String color) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.name = name;
		this.color = color;
	}
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
		
}
