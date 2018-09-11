package com.application;

import com.com.container.WorkPlace;
import com.entities.template.Employee;
import com.enumeration.Position;

public class EmployeeService {

    public static void main(String[] args) {
       Employee employee1 = new Employee("name1",21,2.05,20,Position.MANAGER);
       Employee employee2 = new Employee("name2",17,5,20,Position.CLERK);
        Employee employee3 = new Employee("name3",20,1.5,20,Position.DIRECTOR);
        Employee employee4 = new Employee("name4",11,4.2,20,Position.MANAGER);
        Employee employee5 = new Employee("name5",34,0.5,20,Position.MANAGER);
        WorkPlace workplace = new WorkPlace(5);
        workplace.put(employee1);
        workplace.put(employee2);
        workplace.put(employee3);
        workplace.put(employee4);
        workplace.put(employee5);
        workplace.put(employee1);
        workplace.print();
        System.out.println("maxSalary ="+workplace.maxSalary());
        System.out.println("minSalary ="+workplace.minSalary());
        System.out.println("maxAge ="+workplace.maxAge());
        System.out.println("minAge ="+workplace.minAge());
        workplace.sortByAge();
        workplace.print();
        System.out.println("-------------------------------------------------");
        workplace.sortByAgeDesc();
        workplace.print();
        System.out.println("-------------------------------------------------");
        workplace.sortBySalary();
        workplace.print();
        System.out.println("-------------------------------------------------");
        workplace.sortBySalaryDesc();
        workplace.print();




    }
}
