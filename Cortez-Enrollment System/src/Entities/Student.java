package Entities;

public class Student {
    private String studentId;
    private String name;
    private String program;
    private int units; // NEW

    public Student(String studentId, String name, String program, int units) {
        this.studentId = studentId;
        this.name = name;
        this.program = program;
        this.units = units;
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getProgram() { return program; }
    public int getUnits() { return units; }

    public void setName(String name) { this.name = name; }
    public void setProgram(String program) { this.program = program; }
    public void setUnits(int units) { this.units = units; }
}