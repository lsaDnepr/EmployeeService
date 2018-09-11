package com.com.container;

import com.entities.template.Employee;

public class WorkPlace {
    private Employee[] employees;
    private int pointer;
    public WorkPlace(int capacity){
        this.employees = new Employee[capacity];
    }

    public void put(Employee employee){
        if (pointer==employees.length) {
            System.out.println("Container is full!");
            return;
        }
        employees[pointer]=employee;
        pointer++;
    }

    public double avgSalary(){
        double totalSalary=0;
        if (pointer==0) return -1.0;
        for (int i=0;i<pointer;i++){
           totalSalary+=employees[i].salary();
        }


        return (totalSalary/(pointer+1));
    }

    public void sortBySalary(){
        for(int i=0;i<pointer-1;i++){
            for(int j=i+1;j<pointer;j++){
                if(employees[i].salary()>employees[j].salary()){
                    Employee tmp = employees[i];
                    employees[i]=employees[j];
                    employees[j]=tmp;
                }
            }
        }

    }


    public void sortByAge(){
        for(int i=0;i<pointer-1;i++){
            for(int j=i+1;j<pointer;j++){
                if(employees[i].getAge()>employees[j].getAge()){
                    Employee tmp = employees[i];
                    employees[i]=employees[j];
                    employees[j]=tmp;
                }
            }
        }

    }

    public void sortBySalaryDesc(){
        for(int i=0;i<pointer-1;i++){
            for(int j=i+1;j<pointer;j++){
                if(employees[i].salary()<employees[j].salary()){
                    Employee tmp = employees[i];
                    employees[i]=employees[j];
                    employees[j]=tmp;
                }
            }
        }

    }


    public void sortByAgeDesc(){
        for(int i=0;i<pointer-1;i++){
            for(int j=i+1;j<pointer;j++){
                if(employees[i].getAge()<employees[j].getAge()){
                    Employee tmp = employees[i];
                    employees[i]=employees[j];
                    employees[j]=tmp;
                }
            }
        }

    }

    public double maxSalary(){
        if(pointer==0) return -1.0;
        double maxSalary = employees[0].salary();
        for (int i=0;i<pointer;i++){
            double salary = employees[i].salary();
            if (salary>maxSalary) maxSalary=salary;

        }

        return maxSalary;
    }

    public int maxAge(){
        if(pointer==0) return -1;
        int maxAge = employees[0].getAge();
        for (int i=0;i<pointer;i++){
            int age = employees[i].getAge();
            if (age>maxAge) maxAge=age;

        }

        return maxAge;
    }

    public double minSalary(){
        if(pointer==0) return -1.0;
        double minSalary = employees[0].salary();
        for (int i=0;i<pointer;i++){
            double salary = employees[i].salary();
            if (salary<minSalary) minSalary=salary;

        }

        return minSalary;
    }

    public int minAge(){
        if(pointer==0) return -1;
        int minAge = employees[0].getAge();
        for (int i=0;i<pointer;i++){
            int age = employees[i].getAge();
            if (age<minAge) minAge=age;

        }

        return minAge;
    }

    public void print(){
        if (pointer==0){
            System.out.println("Container is empty!");
            return;
        }
        for (int i=0;i<pointer;i++){
            System.out.println(employees[i]);
        }
    }
}
