package com.company.filter;

public class Student {

    private int id;
    private String name;
    private double marks;
    private double fees;

    public Student(int id, String name, double marks, double fees) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", fees=" + fees +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
}
