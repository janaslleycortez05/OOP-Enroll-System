package org.example.Entity;

public class Student extends Person {

    private String program;

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public void mainTask() {
        System.out.println("Student studying in program: " + program);
    }
}