package com.dj.sample.emp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Sample App to do some functions using Stream API of Java
 *
 * @author djenamani
 */
public class App {

  public static void main(String[] args) {
    System.out.println("Welcome to our Employee Job Board Application");

    List<Employee> emp_list = Arrays.asList(
            new Employee("Ashok", 75000, Employee.DepartmentTypes.IT),
            new Employee("Suresh", 30000, Employee.DepartmentTypes.HR),
            new Employee("Ramesh", 20000, Employee.DepartmentTypes.SALES),
            new Employee("Ravi", 60000, Employee.DepartmentTypes.MARKETING),
            new Employee("Dibyendu", 7500000, Employee.DepartmentTypes.IT));

    System.out.println("Employees with highest salary within the org...");
    EmployeeUtility.getHighestEarners(emp_list, 45000).forEach(System.out::println);

    Optional<Employee> highPaidEmp = EmployeeUtility.getHighestPaidEmployee(emp_list);
    highPaidEmp.ifPresent(e-> System.out.printf("Highest Paid Employee: %s \n", e.getName()));
    System.out.println(highPaidEmp.get().name);

    EmployeeUtility.groupByDepartment(emp_list).forEach((K,V) -> {
      System.out.println("Department:" + K + "\n\tEmployees: "+V);
    });

  }
}
