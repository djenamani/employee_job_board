package com.dj.sample.emp;

import lombok.Data;

@Data
public class Employee {

    String name;
    double salary;

    public Employee(){

    }

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
}
