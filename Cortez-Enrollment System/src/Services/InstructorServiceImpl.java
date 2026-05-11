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
    public void updateInstructor(Instructor instructor) {
        for (Instructor i : instructors) {
            if (i.getInstructorId().equals(instructor.getInstructorId())) {
                i.setName(instructor.getName());
                i.setSpecialization(instructor.getSpecialization());
            }
        }
    }

    @Override
    public void removeInstructor(String instructorId) {
        instructors.removeIf(i -> i.getInstructorId().equals(instructorId));
    }

    @Override
    public Instructor getInstructorDetails(String instructorId) {
        for (Instructor i : instructors) {
            if (i.getInstructorId().equals(instructorId)) {
                return i;
            }
        }
        return null;
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return instructors;
    }

    @Override
    public void assignInstructorToSection(Instructor instructor, Section section) {
        section.setInstructor(instructor);
    }
}