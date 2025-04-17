package com.dj.sample.emp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Sample App to do some functions using Stream API of Java
 *
 * @author djenamani
 */
public class App {

  /**
   * Find the list of employees whose salary is more than a given salary
   * Use Stream API's filter method to solve the problem.
   *
   * @param empList      Employee List
   * @param salary_limit Given salary limit
   */
  public static List<Employee> getHighestEarners(List<Employee> empList, double salary_limit){
    return empList.stream().filter(e -> e.getSalary() > salary_limit).collect(Collectors.toList());
  }

  /**
   * Return the Employee with highest salary in the organization
   * @param emp_list
   */
  public static Optional<Employee> getHighestPaidEmployee(List<Employee> emp_list){
      return emp_list.stream().max(Comparator.comparingDouble(e -> e.salary));
  }

  public static void main(String[] args) {
    System.out.println("Welcome to our Employee Job Board Application");

    Employee employee = new Employee();
    employee.setName("Dibyendu");
    employee.setSalary(50000);

    List<Employee> emp_list = Arrays.asList(employee, new Employee("Ashok", 75000));

    System.out.println("Employees with highest salary within the org...");
    getHighestEarners(emp_list, 45000).forEach(System.out::println);

    Optional<Employee> highPaidEmp = getHighestPaidEmployee(emp_list);
    highPaidEmp.ifPresent(e-> System.out.printf("Highest Paid Employee: %s \n", e.getName()));
    System.out.println(highPaidEmp.get().name);;

  }
}
