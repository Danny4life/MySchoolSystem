package service.impl;

import model.Principal;
import service.PrincipalService;

public class PrincipalServiceImpl implements PrincipalService {
    @Override
    public void display(Principal principal) {
        System.out.println("FullName : " +
                principal.getName() + "\n" +
                "Age : " + principal.getAge() +
                "\n" + "Gender : " + principal.getGender());
    }
}
