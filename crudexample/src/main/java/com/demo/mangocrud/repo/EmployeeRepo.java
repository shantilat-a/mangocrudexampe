package com.demo.mangocrud.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.mangocrud.model.Employee;

public interface EmployeeRepo extends MongoRepository<Employee,String> {

}
