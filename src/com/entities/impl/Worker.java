package com.entities.impl;

import com.entities.template.Employee;
import com.enumeration.Position;

public class Worker extends Employee {

    public Worker(String name, int age, double rate, int hours, Position position){
        super(name,age,rate,hours,position);
    }

}
