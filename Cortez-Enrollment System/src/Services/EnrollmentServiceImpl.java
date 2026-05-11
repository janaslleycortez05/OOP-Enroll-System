package Services;

import Interfaces.IEnrollmentService;
import Entities.Student;
import Entities.Section;

import java.util.ArrayList;
import java.util.List;

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
public List<String> viewDepartmentHierarchy(Department department) {

    List<String> output = new ArrayList<>();

    output.add("Department: " + department.getDepartmentName());

    for (Section section : department.getSections()) {
        output.add(" Section: " + section.getSectionName());

        if (section.getInstructor() != null) {
            output.add("  Instructor: " + section.getInstructor().getName());
        }

        for (Student s : section.getEnrolledStudents()) {
            output.add("   Student: " + s.getName());
        }
    }

    return output;
}
}