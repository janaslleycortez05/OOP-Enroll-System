package org.example;

import org.example.Entity.Student;
import org.example.Service.StudentRegistration;

public class Main {

    static void main(String[] args) {

        Student s1 = new Student();
        s1.setID(1);
        s1.setName("John");
        s1.setProgram("Information Technology");

        Student s2 = new Student();
        s2.setID(2);
        s2.setName("Anna");
        s2.setProgram("Computer Science");

        StudentRegistration reg = new StudentRegistration();

        reg.saveStudent(s1);
        reg.saveStudent(s2);

        reg.displayAllStudent();
    }
}