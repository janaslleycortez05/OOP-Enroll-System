package Interfaces;

import Entities.Instructor;
import Entities.Section;

public interface IInstructorService {

    void addInstructor(Instructor instructor);

    void assignInstructorToSection(Instructor instructor, Section section);

    void getInstructorDetails(String instructorId);
}