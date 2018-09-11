package com.container.wrappers;

import com.com.container.WorkPlace;
import com.entities.impl.Worker;

public class Factory {
    private WorkPlace work;

    public Factory(int capacity){
        this.work=new WorkPlace(capacity);
    }

    public void put(Worker worker){
       work.put(worker);
    }

    public double avgSalary(){

        return work.avgSalary();
    }

    public void sortBySalary(){
       work.sortBySalary();
    }


    public void sortByAge(){
      work.sortByAge();
    }

    public void sortBySalaryDesc(){
       work.sortBySalaryDesc();
    }


    public void sortByAgeDesc(){
        work.sortByAgeDesc();
    }

    public double maxSalary(){

        return work.maxSalary();
    }

    public int maxAge(){

        return work.maxAge();
    }

    public double minSalary(){

        return work.maxSalary();
    }

    public int minAge(){

        return work.minAge();
    }

    public void print(){
        work.print();
    }
}
