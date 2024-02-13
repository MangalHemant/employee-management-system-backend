package com.hemantmangal.employeemanagementsystembackend.service;

import com.hemantmangal.employeemanagementsystembackend.model.Employee;

import java.util.List;


public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);
}
