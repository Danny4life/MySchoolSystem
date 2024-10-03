package service.impl;

import model.Course;
import model.Student;
import model.Teacher;
import service.CourseService;

public class TeachableServiceImpl implements CourseService {
    @Override
    public void teachCourse(Teacher teacher, Course course) {
        System.out.println("FullName : " + teacher.getName() +
                "\n" + "Gender : " + teacher.getGender() + "\n" +
                "Age : " + teacher.getAge() + "\n" +
                "Course Taught : " + course.getCourseOffer());
    }

    @Override
    public void takeCourse(Student student, Course course) {
        System.out.println("FullName : " + student.getName() +
                "\n" + "Gender : " + student.getGender() + "\n" +
                "Age : " + student.getAge() + "\n" +
                "Course Taught : " + course.getCourseOffer());

    }
}
