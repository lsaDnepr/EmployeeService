package com.entities.template;

import com.enumeration.Position;

import java.util.Objects;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    private int age;
    private Position position;
    private static int count;
    private static double totalSalary;
    private static int totalHours;

    public Employee(){ count++;}
    public Employee(String name, double rate, Position position){
        this.name = name;
        this.rate=rate;
        this.position=position;
        count++;
    }

    public Employee(String name, int age, double rate, int hours, Position position){
        this.name = name;
        this.rate=rate;
        this.age = age;
        this.hours=hours;
        this.position=position;
        totalHours+=hours;
        count++;
        totalSalary+=salary();
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {return this.position.toString();}
   public void setPosition(Position position) {this.position=position;};
    public double salary(){
        return  rate*hours;
    }

    public void changeRate(double rate){
        totalSalary = totalSalary - salary();
        this.rate=rate;
        totalSalary+=salary();
    }

    public double bonuses(double percent){
        return salary()*percent;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", age=" + age +
                ", position=" + position +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.rate, rate) == 0 &&
                hours == employee.hours &&
                Objects.equals(name, employee.name) &&
                Objects.equals(getPosition(), employee.getPosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rate, hours, getPosition());
    }

    public static int getTotalHours(){
        return totalHours;
    }

    public static double getAvgSalary() { return totalSalary/count;};


}
