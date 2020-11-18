package com.revoltcode.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revoltcode.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
