package com.workintech.inheritance.company;

public class Blacksmith extends Employee {

    public Blacksmith(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(11000);
        System.out.println("Blacksmith " + getName() + " starts working");
    }
}
