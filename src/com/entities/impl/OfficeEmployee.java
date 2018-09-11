package com.entities.impl;

import com.entities.template.Employee;
import com.enumeration.Position;

public class OfficeEmployee extends Employee {
    public OfficeEmployee(String name,int age, double rate, int hours, Position position){
        super(name,age,rate,hours,position);
    }
}
