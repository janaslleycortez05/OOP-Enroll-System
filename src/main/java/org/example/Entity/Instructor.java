package org.example.Entity;

import java.util.ArrayList;

public class Instructor extends Person {

    private final ArrayList<String> courses = new ArrayList<>();

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    @Override
    public void mainTask() {
        System.out.println("Instructor main task: Teach courses");
    }
}