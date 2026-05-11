package Main;

import Entities.*;
import Services.*;
import Interfaces.*;
import Exceptions.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IStudentService studentService = new StudentServiceImpl();
        IEnrollmentService enrollmentService = new EnrollmentServiceImpl();
        ITuitionService tuitionService = new TuitionServiceImpl();
        IInstructorService instructorService = new InstructorServiceImpl();
        Map<String, TuitionFeePayment> payments = new HashMap<>();

        Section section = new Section("BSIT-1A", 2);
        Department dept = new Department("College of Computer Studies");
        dept.getSections().add(section);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add Student");
            System.out.println("2. Enroll Student");
            System.out.println("3. View Department");
            System.out.println("4. Add Course to Section");
            System.out.println("5. Add Instructor");
            System.out.println("6. Assign Instructor to Section");
            System.out.println("7. Pay Tuition");
            System.out.println("8. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter ID: ");
                        String id = sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Program: ");
                        String program = sc.nextLine();

                        System.out.print("Enter Units: ");
                        int units = sc.nextInt();
                        sc.nextLine();

                        Student s = new Student(id, name, program, units);
                        studentService.addStudent(s);

                        System.out.println("Student added!");
                        break;

                    case 2:
                        System.out.print("Enter Student ID: ");
                        String sid = sc.nextLine();

                        Student found = null;
                        for (Student st : studentService.getAllStudents()) {
                            if (st.getStudentId().equals(sid)) {
                                found = st;
                            }
                        }

                        if (found != null) {
                            enrollmentService.enrollStudentInSection(found, section);
                            System.out.println("Enrolled successfully!");
                        } else {
                            System.out.println("Student not found!");
                        }
                        break;

                    case 3:
                        List<String> hierarchy = enrollmentService.viewDepartmentHierarchy(dept);
                        for (String line : hierarchy) {
                            System.out.println(line);
                        }
                        break;

                    case 4:
                        System.out.print("Enter Course ID: ");
                        String cid = sc.nextLine();

                        System.out.print("Enter Course Name: ");
                        String cname = sc.nextLine();

                        System.out.print("Enter Units: ");
                        int cunits = sc.nextInt();
                        sc.nextLine();

                        Course course = new Course(cid, cname, cunits);
                        section.getCourses().add(course);

                        System.out.println("Course added to section!");
                        break;
                    case 5:
                        System.out.print("Enter Instructor ID: ");
                        String iid = sc.nextLine();

                        System.out.print("Enter Name: ");
                        String iname = sc.nextLine();

                        System.out.print("Enter Specialization: ");
                        String spec = sc.nextLine();

                        Instructor instructor = new Instructor(iid, iname, spec);
                        instructorService.addInstructor(instructor);

                        System.out.println("Instructor added!");
                        break;

                    case 6:
                        System.out.print("Enter Instructor ID: ");
                        String assignId = sc.nextLine();

                        Instructor foundInstructor = instructorService.getInstructorDetails(assignId);

                        if (foundInstructor != null) {
                            instructorService.assignInstructorToSection(foundInstructor, section);
                            System.out.println("Instructor assigned to section!");
                        } else {
                            System.out.println("Instructor not found!");
                        }
                        break;

                    case 7:
                        System.out.print("Enter Student ID: ");
                        String payId = sc.nextLine();

                        Student payStudent = null;
                        for (Student st : studentService.getAllStudents()) {
                            if (st.getStudentId().equals(payId)) {
                                payStudent = st;
                            }
                        }

                        if (payStudent == null) {
                            System.out.println("Student not found!");
                            break;
                        }

                        double fee = tuitionService.calculateFee(payStudent, section);

                        if (fee == 0) {
                            System.out.println("No courses assigned. Cannot calculate tuition.");
                            break;
                        }

                        TuitionFeePayment payment = payments.get(payId);

                        if (payment == null) {
                            payment = new TuitionFeePayment(payStudent, fee);
                            payments.put(payId, payment);
                        }

                        System.out.println("Total Fee: " + fee);

                        System.out.print("Enter payment amount: ");
                        double amount = sc.nextDouble();
                        sc.nextLine();

                        tuitionService.makePayment(payment, amount);

                        System.out.println("Remaining Balance: " +
                                tuitionService.getRemainingBalance(payment));
                        break;

                    case 8:
                        System.exit(0);
                }

            } catch (DuplicateStudentException | SectionFullException e) {
                System.out.println("ERROR: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input!");
                sc.nextLine();
            }
        }
    }
}