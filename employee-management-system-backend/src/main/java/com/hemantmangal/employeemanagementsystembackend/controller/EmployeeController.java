package com.hemantmangal.employeemanagementsystembackend.controller;

import com.hemantmangal.employeemanagementsystembackend.model.Employee;
import com.hemantmangal.employeemanagementsystembackend.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee)
    {
        return this.employeeService.createEmployee(employee);
    }
}
