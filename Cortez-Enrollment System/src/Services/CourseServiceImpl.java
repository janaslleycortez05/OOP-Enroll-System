package Services;

import Interfaces.ICourseService;
import Entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements ICourseService {

    private List<Course> courses = new ArrayList<>();

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void updateCourse(Course course) {
        for (Course c : courses) {
            if (c.getCourseId().equals(course.getCourseId())) {
                c.setCourseName(course.getCourseName());
                c.setUnits(course.getUnits());
            }
        }
    }

    @Override
    public void removeCourse(String courseId) {
        courses.removeIf(c -> c.getCourseId().equals(courseId));
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }
}