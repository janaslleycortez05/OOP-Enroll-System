package Interfaces;

import Entities.Student;
import Exceptions.DuplicateStudentException;
import java.util.List;

public interface IStudentService {

    void addStudent(Student student) throws DuplicateStudentException;

    void updateStudent(Student student);

    void removeStudent(String studentId);

    List<Student> getAllStudents();
}