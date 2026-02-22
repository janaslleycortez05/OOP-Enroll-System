package org.example;

import org.example.Entity.Course;
import org.example.Entity.Student;
import org.example.Service.CourseRegistration;
import org.example.Service.StudentRegistration;

public class Main {

    public static void main(String[] args) {

        StudentRegistration studentReg = new StudentRegistration();
        CourseRegistration courseReg = new CourseRegistration();

        // ===== SAMPLE STUDENTS =====
        Student s1 = new Student("000123", "John Doe", "Information Technology");
        Student s2 = new Student("2024395107", "John Mark", "Information Technology");

        studentReg.saveStudent(s1);
        studentReg.saveStudent(s2);

        System.out.println("=== ALL STUDENTS ===");
        studentReg.displayAllStudents();

        // ===== SAMPLE COURSES =====
        Course c1 = new Course("IT101", "Introduction to Programming", "Information Technology");
        Course c2 = new Course("IT202", "Database Systems", "Information Technology");

        courseReg.saveCourse(c1);
        courseReg.saveCourse(c2);

        System.out.println("\n=== ALL COURSES ===");
        courseReg.displayAllCourses();

        // ===== UPDATE SAMPLE =====
        studentReg.updateStudent("000123", "John Updated", "Software Engineering");
        courseReg.updateCourse("IT101", "Advanced Programming", "Software Engineering");

        System.out.println("\n=== AFTER UPDATE ===");
        studentReg.displayAllStudents();
        courseReg.displayAllCourses();

        // ===== REMOVE SAMPLE =====
        studentReg.removeStudent("2024395107");
        courseReg.removeCourse("IT202");

        System.out.println("\n=== AFTER REMOVE ===");
        studentReg.displayAllStudents();
        courseReg.displayAllCourses();
    }
}