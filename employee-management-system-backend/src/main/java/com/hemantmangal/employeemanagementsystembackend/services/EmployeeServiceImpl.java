package com.hemantmangal.employeemanagementsystembackend.services;

import com.hemantmangal.employeemanagementsystembackend.entity.EmployeeEntity;
import com.hemantmangal.employeemanagementsystembackend.model.Employee;
import com.hemantmangal.employeemanagementsystembackend.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        EmployeeEntity employeeEntity=new EmployeeEntity();
        BeanUtils.copyProperties(employee,employeeEntity);
        employeeRepository.save(employeeEntity);
        return employee;

    }
}
