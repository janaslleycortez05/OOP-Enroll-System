package org.example.Entity;

public class Student extends Person {

    private String program;

    public Student(String id, String name, String program) {
        setID(id);
        setName(name);
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "ID: " + getID() + " Name: " + getName() + " Program: " + program;
    }
}