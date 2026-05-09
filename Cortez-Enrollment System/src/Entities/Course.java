package Entities;

public class Course {
    private String courseId;
    private String courseName;
    private int units;

    public Course(String courseId, String courseName, int units) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.units = units;
    }

    public String getCourseId() { return courseId; }
    public void setCourseId(String courseId) { this.courseId = courseId; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public int getUnits() { return units; }
    public void setUnits(int units) { this.units = units; }
}