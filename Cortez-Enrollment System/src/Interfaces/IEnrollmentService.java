package Interfaces;

import Entities.Student;
import Entities.Section;

import java.util.List;

import Entities.Department;
import Exceptions.SectionFullException;

public interface IEnrollmentService {

    void enrollStudentInSection(Student student, Section section) throws SectionFullException;

   List<String> viewDepartmentHierarchy(Department department);
}