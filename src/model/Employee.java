package model;

import interfaces.ILearner;
import interfaces.IWorker;

public class Employee extends Human implements IWorker, ILearner {
    private final String job;
    private final float salary;

    public static final String COMPANY_NAME = "Smart Technologies";

    public Employee(int age, String name, boolean isStudent, String job, float salary) {
        super(age, name, isStudent);
        this.job = job;
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println(name + " works as a " + job);
    }

    @Override
    public float getSalary() {
        return salary;
    }

    @Override
    public void study() {
        System.out.println(name + " is improving professional skills");
    }

    @Override
    public float getGPA() {
        return 0.0f;
    }

    @Override
    public String getType() {
        return "I'm an employee";
    }
}