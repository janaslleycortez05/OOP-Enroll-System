package org.example.Service;

import org.example.Entity.Student;

public class StudentRegistration {

    private String courseID;
    private String courseName;
    private String program;

    public void Course(String courseID, String courseName, String program) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.program = program;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getProgram() {
        return program;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return courseID + " - " + courseName + " - " + program;
    }

    public void saveStudent(Student s1) {
    }

    public void displayAllStudents() {
    }

    public void updateStudent(String number, String johnUpdated, String softwareEngineering) {
    }

    public void removeStudent(String number) {
    }
}