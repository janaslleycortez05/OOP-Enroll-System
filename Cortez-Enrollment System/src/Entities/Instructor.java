package Entities;

public class Instructor {
    private String instructorId;
    private String name;
    private String specialization;

    public Instructor(String instructorId, String name, String specialization) {
        this.instructorId = instructorId;
        this.name = name;
        this.specialization = specialization;
    }

    public String getInstructorId() { return instructorId; }
    public void setInstructorId(String instructorId) { this.instructorId = instructorId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
}