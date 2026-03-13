package org.example.Entity;

public class Course {

    private String courseID;
    private String courseName;
    private String program;

    public Course(String courseID, String courseName, String program) {
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
}