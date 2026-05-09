package Services;

import Interfaces.IInstructorService;
import Entities.Instructor;
import Entities.Section;

import java.util.ArrayList;
import java.util.List;

public class InstructorServiceImpl implements IInstructorService {

    private List<Instructor> instructors = new ArrayList<>();

    @Override
    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    @Override
    public void assignInstructorToSection(Instructor instructor, Section section) {
        section.setInstructor(instructor);
    }

    @Override
    public void getInstructorDetails(String instructorId) {
        for (Instructor i : instructors) {
            if (i.getInstructorId().equals(instructorId)) {
                System.out.println("Instructor: " + i.getName());
            }
        }
    }
}