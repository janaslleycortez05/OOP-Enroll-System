package org.example.Service;

import org.example.Entity.Course;

import java.util.ArrayList;
public class CourseRegistration {

    private ArrayList<Course> courseList = new ArrayList<>();

    public void saveCourse(Course course) {
        courseList.add(course);
    }

    public void displayAllCourses() {
        if (courseList.isEmpty()) {
            System.out.println("No courses found.");
            return;
        }

        for (Course c : courseList) {
            System.out.println("----------------------");
            System.out.println(c);
        }
    }

    public void updateCourse(String courseID, String newName, String newProgram) {
        for (Course c : courseList) {
            if (c.getCourseID().equals(courseID)) {
                c.setCourseName(newName);
                c.setProgram(newProgram);
                return;
            }
        }
    }

    public void removeCourse(String courseID) {
        courseList.removeIf(c -> c.getCourseID().equals(courseID));
    }
}