package service;

import model.Course;
import model.Student;
import model.Teacher;

public interface CourseService {

    void teachCourse(Teacher teacher, Course course);

    void takeCourse(Student student, Course course);
}
