package service;

import model.Principal;
import model.Student;

public interface StudentService {

    void expelStudent(Student student, Principal principal);
}
