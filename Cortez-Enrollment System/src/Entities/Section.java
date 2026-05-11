package Entities;

import java.util.ArrayList;
import java.util.List;

public class Section {
    private String sectionName;
    private int maxCapacity;
    private Instructor instructor;
    private List<Student> enrolledStudents;
    private List<Course> courses = new ArrayList<>();

    public List<Course> getCourses() {
        return courses;
    }

    public Section(String sectionName, int maxCapacity) {
        this.sectionName = sectionName;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public boolean enrollStudent(Student student) {
        if (student == null || enrolledStudents.size() >= maxCapacity) {
            return false;
        }
        if (enrolledStudents.contains(student)) {
            return false;
        }
        enrolledStudents.add(student);
        return true;
    }

    public boolean removeStudent(Student student) {
        return enrolledStudents.remove(student);
    }

    public void addCourse(Course course) {
        if (course == null || courses.contains(course)) {
            return;
        }
        courses.add(course);
    }

    public boolean removeCourse(Course course) {
        return courses.remove(course);
    }
}