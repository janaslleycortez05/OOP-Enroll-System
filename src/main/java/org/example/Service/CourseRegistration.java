package org.example.Service;

import org.example.Entity.Course;

import java.util.ArrayList;

public class CourseRegistration {

    private final ArrayList<Course> courseList = new ArrayList<>();

    // Save course
    public void saveCourse(Course course) {
        courseList.add(course);
    }

    // Display all courses
    public void displayAllCourses() {
        for (Course c : courseList) {
            System.out.println("Course ID: " + c.getCourseID() +
                    ", Course Name: " + c.getCourseName() +
                    ", Program: " + c.getProgram());
        }
    }

    // Update course name
    public void updateCourse(String it101, String courseID, String newName) {

        for (Course c : courseList) {
            if (c.getCourseID().equals(courseID)) {
                c.setCourseName(newName);
            }
        }
    }

    // Remove course
    public void removeCourse(String courseID) {
        courseList.removeIf(c -> c.getCourseID().equals(courseID));
    }
}