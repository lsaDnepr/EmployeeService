package com.application;

import com.entities.Employee;
import com.enumeration.Position;

public class EmployeeService {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan",30.5, 15, Position.DIRECTOR);
        Employee employee2 = new Employee("Petya",17.8, 20,Position.MANAGER);
        Employee employee3 = new Employee("Kolya",16.3, 40,Position.CLERK);
        System.out.println("Total hours = "+Employee.getTotalHours());
        System.out.println("Average salary = "+Employee.getAvgSalary());
        employee2.changeRate(20.0);
        System.out.println("Average salary = "+Employee.getAvgSalary());



    }
}
