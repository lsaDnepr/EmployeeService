package com.application;

import com.entities.Employee;

public class TotalHoursService {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan",30.5, 15);
        Employee employee2 = new Employee("Petya",17.8, 20);
        Employee employee3 = new Employee("Kolya",16.3, 40);
        System.out.println("Total hours = "+Employee.getTotalHours());

    }
}
