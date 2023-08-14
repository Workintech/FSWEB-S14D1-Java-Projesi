package com.workintech.inheritance.company;

public class Employee {

    private long id;
    private String name;
    private double salary;

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary < 11500 ? 11500 : salary;
    }

    public void work() {
        System.out.println(name + " starts working");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ID: " + id);
        builder.append(" Name: " + name);
        return builder.toString();
    }
}
