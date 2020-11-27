package com.demo.mangocrud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	@Id
	@Indexed(unique=true)
	private String _id;
	@Indexed(unique=true)
	private String name;
	private String designation;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [_id=" + _id + ", name=" + name + ", designation=" + designation + "]";
	}
	public Employee() {
		super();
	}
	public Employee(String _id, String name, String designation) {
		super();
		this._id = _id;
		this.name = name;
		this.designation = designation;
	}
	
	

}
