package org.example.Service;

import org.example.Entity.Student;

import java.util.ArrayList;

public class StudentRegistration {

    private ArrayList<Student> studentList = new ArrayList<>();

    public void saveStudent(Student student) {
        studentList.add(student);
        System.out.println("Student saved successfully.");
    }

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : studentList) {
            System.out.println("----------------------");
            System.out.println(s);
        }
    }

    public void updateStudent(String studentID, String newName, String newProgram) {
        for (Student s : studentList) {
            if (s.getStudentID().equals(studentID)) {
                s.setStudentName(newName);
                s.setProgram(newProgram);
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void removeStudent(String studentID) {
        for (Student s : studentList) {
            if (s.getStudentID().equals(studentID)) {
                studentList.remove(s);
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}