package model;

import baseClass.Person;
import enums.Gender;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age, Gender gender) {
        super(name, age, gender);
    }
}
