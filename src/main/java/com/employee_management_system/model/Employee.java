package com.employee_management_system.model;


import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}