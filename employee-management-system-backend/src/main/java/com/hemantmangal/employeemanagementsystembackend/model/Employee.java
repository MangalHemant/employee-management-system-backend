package com.hemantmangal.employeemanagementsystembackend.model;

import lombok.Data;

@Data
public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
