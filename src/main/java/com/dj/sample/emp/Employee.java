package com.dj.sample.emp;

import lombok.Data;

@Data
public class Employee {

    String name;
    double salary;
    DepartmentTypes department;

    enum DepartmentTypes{
        HR, IT, SALES, MARKETING
    }


    public Employee(){

    }

    public Employee(String name, double salary, DepartmentTypes department){
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
}
