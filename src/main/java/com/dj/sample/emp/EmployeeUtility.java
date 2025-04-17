package com.dj.sample.emp;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
/**
 * Sample Employee Utility class to do some functions using Stream API of Java
 *
 * @author djenamani
 */
public class EmployeeUtility {

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

    /**
     * Group Employees by their Department
     * @param employees
     */
    public static Map<Employee.DepartmentTypes, List<Employee>> groupByDepartment(List<Employee> employees){
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }
}
