package Interfaces;

import Entities.Student;
import Entities.Section;
import Entities.Department;
import Exceptions.SectionFullException;

public interface IEnrollmentService {

    void enrollStudentInSection(Student student, Section section) throws SectionFullException;

    void viewDepartmentHierarchy(Department department);
}