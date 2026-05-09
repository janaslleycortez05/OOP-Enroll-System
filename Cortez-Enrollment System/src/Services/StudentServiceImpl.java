package Services;

import Interfaces.IStudentService;
import Entities.Student;
import Exceptions.DuplicateStudentException;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements IStudentService {

    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) throws DuplicateStudentException {
        for (Student s : students) {
            if (s.getStudentId().equals(student.getStudentId())) {
                throw new DuplicateStudentException("Student ID already exists!");
            }
        }
        students.add(student);
    }

    @Override
    public void updateStudent(Student student) {
        for (Student s : students) {
            if (s.getStudentId().equals(student.getStudentId())) {
                s.setName(student.getName());
                s.setProgram(student.getProgram());
            }
        }
    }

    @Override
    public void removeStudent(String studentId) {
        students.removeIf(s -> s.getStudentId().equals(studentId));
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }
}