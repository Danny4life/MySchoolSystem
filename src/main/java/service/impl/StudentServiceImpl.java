package service.impl;

import model.Principal;
import model.Student;
import service.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public void expelStudent(Student student, Principal principal) {
        System.out.println("Student FullName : " +
                student.getName() + "\n" +
                "Expulsion Duration : " + "2 WEEKS" + "\n" +
                "Expelled By : " + "Principal " + principal.getName());
    }
}
