package model;

public abstract class Human {
    protected int age;
    protected String name;
    protected boolean isStudent;

    public Human(int age, String name, boolean isStudent) {
        this.age = age;
        this.name = name;
        this.isStudent = isStudent;
    }
    public void introduce() {
        System.out.println("Hello, my name is " + name);
    }
    public abstract String getType();
}