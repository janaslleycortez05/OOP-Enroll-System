package org.example.Service;

import org.example.Entity.Student;
import java.util.ArrayList;

public class StudentRegistration {

    private final ArrayList<Student> studentList = new ArrayList<>();

    public void saveStudent(Student student) {
        studentList.add(student);
    }

    public void displayAllStudent() {
        for (Student s : studentList) {
            System.out.println("Student ID: " + s.getID());
            System.out.println("Student Name: " + s.getName());
            System.out.println("Program: " + s.getProgram());
            System.out.println();
        }
    }

    public void updateStudent(int id, String newName) {
        for (Student s : studentList) {
            if (s.getID() == id) {
                s.setName(newName);
            }
        }
    }

    public void removeStudent(int id) {
        studentList.removeIf(s -> s.getID() == id);
    }
}