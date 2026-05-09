package Services;

import Interfaces.IEnrollmentService;
import Entities.Student;
import Entities.Section;
import Entities.Department;
import Exceptions.SectionFullException;

public class EnrollmentServiceImpl implements IEnrollmentService {

    @Override
    public void enrollStudentInSection(Student student, Section section) throws SectionFullException {

        if (section.getEnrolledStudents().size() >= section.getMaxCapacity()) {
            throw new SectionFullException("Section is full!");
        }

        section.getEnrolledStudents().add(student);
    }

    @Override
    public void viewDepartmentHierarchy(Department department) {

        System.out.println("Department: " + department.getDepartmentName());

        department.getSections().forEach(section -> {
            System.out.println(" Section: " + section.getSectionName());

            if (section.getInstructor() != null) {
                System.out.println("  Instructor: " + section.getInstructor().getName());
            }

            section.getEnrolledStudents().forEach(student ->
                System.out.println("   Student: " + student.getName())
            );
        });
    }
}