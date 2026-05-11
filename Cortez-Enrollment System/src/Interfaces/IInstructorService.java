package Interfaces;

import Entities.Instructor;
import Entities.Section;
import java.util.List;

public interface IInstructorService {

    void addInstructor(Instructor instructor);

    void updateInstructor(Instructor instructor);

    void removeInstructor(String instructorId);

    Instructor getInstructorDetails(String instructorId);

    List<Instructor> getAllInstructors();

    void assignInstructorToSection(Instructor instructor, Section section);
}