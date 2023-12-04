package ru.podol.tr_database.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.podol.tr_database.models.*;
import ru.podol.tr_database.repozitories.*;

import java.util.List;

@Controller
public class ManagerController {
    @Autowired
    private OrdersRepozitory ordersRepozitory;
    @GetMapping("/manager")
    public String getUsersPage(Model model){
        List<Order> orders = ordersRepozitory.findAll();
        model.addAttribute("orders",orders);
        return "manager_page";
    }

}
