package service.impl;

import model.Applicants;
import service.ApplicantService;

public class ApplicantServiceImpl implements ApplicantService {
    @Override
    public void displayApplicantData(Applicants applicants) {
        System.out.println("FullName : " +
                applicants.getName() + "\n" +
                "Age : " + applicants.getAge() +
                "\n" + "Gender : " + applicants.getGender());
    }

    @Override
    public void admitStudent(Applicants applicants) {

        /**
         * 1. they should be between 18 years and above
         * 2. if not, we should send a regret message, and ask them try again later
         */

        if(applicants.getAge() >= 18){
            System.out.println("CONGRATULATIONS!!! " + applicants.getName() +
                    " You have been offer provisional admission into Decagon Institute to study Java");
        }else {
            System.out.println("HI, " + applicants.getName() +
                    " we regret to inform you that you have been denied admission, try again when you clock 18");
        }

    }
}
