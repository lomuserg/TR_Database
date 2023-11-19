package ru.podol.tr_database.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.podol.tr_database.models.User;
import ru.podol.tr_database.repozitories.UsersRepozitory;

import java.util.List;

@Controller
public class UsersController {
    @Autowired
    private UsersRepozitory usersRepozitory;
    @GetMapping("/users")
    public String getUsersPage(Model model){
        List<User> users = usersRepozitory.findAll();
        model.addAttribute("users",users);
        return "users_page";
    }

}
