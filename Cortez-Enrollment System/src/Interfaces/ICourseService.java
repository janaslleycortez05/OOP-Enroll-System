package Interfaces;

import Entities.Course;
import java.util.List;

public interface ICourseService {

    void addCourse(Course course);

    void updateCourse(Course course);

    void removeCourse(String courseId);

    List<Course> getAllCourses();
}