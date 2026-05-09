package Main;

import Entities.*;
import Services.*;
import Interfaces.*;
import Exceptions.*;

public class Main {

    public static void main(String[] args) {

        // Create services
        IStudentService studentService = new StudentServiceImpl();
        IEnrollmentService enrollmentService = new EnrollmentServiceImpl();

        // Create section
        Section section = new Section("BSIT-1A", 2);

        // Create students
        Student s1 = new Student("S1", "Alice", "IT");
        Student s2 = new Student("S2", "Bob", "IT");
        Student s3 = new Student("S3", "Charlie", "IT");

        try {
            // Add students
            studentService.addStudent(s1);
            studentService.addStudent(s2);
            studentService.addStudent(s3);

            // Enroll students
            enrollmentService.enrollStudentInSection(s1, section);
            enrollmentService.enrollStudentInSection(s2, section);

            // This should trigger exception
            enrollmentService.enrollStudentInSection(s3, section);

        } catch (DuplicateStudentException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (SectionFullException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Display enrolled students
        System.out.println("\nEnrolled Students:");
        for (Student s : section.getEnrolledStudents()) {
            System.out.println(s.getName());
        }
    }
}