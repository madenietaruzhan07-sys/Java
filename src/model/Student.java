package model;

import interfaces.ILearner;

public final class Student extends Human implements ILearner {
    private final String university;
    private final float gpa;
    private final String studentId;

    public Student(int age, String name, boolean isStudent, String university, float gpa, String studentId) {
        super(age, name, isStudent);
        this.university = university;
        this.gpa = gpa;
        this.studentId = studentId;
    }

    @Override
    public void study() {
        System.out.println(name + " is a student of " + university);
    }

    @Override
    public float getGPA() {
        return gpa;
    }

    @Override
    public String getType() {
        return "I'm a student";
    }

    public final void printStudentId() {
        System.out.println("Student Id: " + studentId);
    }
}
