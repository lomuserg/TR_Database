package ru.podol.tr_database.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.podol.tr_database.models.*;
import ru.podol.tr_database.repozitories.*;

import java.util.List;

@Controller
public class OwnerController {
    @Autowired
    private UsersRepozitory usersRepozitory;
    @Autowired
    private ProductRepozitory productsRepozitory;
    @Autowired
    private OrdersRepozitory ordersRepozitory;
    @Autowired
    private CostomerRepozitory costomerRepozitory;
    @Autowired
    private EmployeeRepozitory employeeRepozitory;
    @GetMapping("/owner")
    public String getUsersPage(Model model){
        List<User> users = usersRepozitory.findAll();
        model.addAttribute("users",users);
        List<Product> products = productsRepozitory.findAll();
        model.addAttribute("products",products);
        List<Order> orders = ordersRepozitory.findAll();
        model.addAttribute("orders",orders);
        List<Costomer> costomers = costomerRepozitory.findAll();
        model.addAttribute("costomers",costomers);
        List<Employee> employees = employeeRepozitory.findAll();
        model.addAttribute("employees",employees);
        return "owner_page";
    }

}
