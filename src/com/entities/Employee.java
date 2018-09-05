package com.entities;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    private static int totalHours;

    public Employee(){}
    public Employee(String name, double rate){
        this.name = name;
        this.rate=rate;
    }

    public Employee(String name, double rate, int hours){
        this.name = name;
        this.rate=rate;
        this.hours=hours;
        totalHours+=hours;
    }

    public double salary(){
        return  rate*hours;
    }

    public void changeRate(double rate){
        this.rate=rate;
    }

    public double bonuses(double percent){
        return salary()*percent;
    }

    @Override
    public String toString(){
        return "Employee:"+": "+"name= "+this.name+", rate= "+this.rate+", hours= "+this.hours;
    }

    public static int getTotalHours(){
        return totalHours;
    }


}
