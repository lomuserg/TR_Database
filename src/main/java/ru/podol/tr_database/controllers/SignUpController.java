package ru.podol.tr_database.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.podol.tr_database.models.User;
import ru.podol.tr_database.repozitories.UsersRepozitory;

@Controller
public class SignUpController {

    @Autowired
    private UsersRepozitory usersRepozitory;
    @GetMapping("/signUp")
    String getSignPage(){
        return "signUp_page";
    }
    @PostMapping("/signUp")
    public String signUpUser(User user){
    usersRepozitory.save(user);
    return "redirect:/signUp";
    }
}
