package ru.podol.tr_database.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.podol.tr_database.models.Costomer;
import ru.podol.tr_database.models.Order;
import ru.podol.tr_database.models.Product;
import ru.podol.tr_database.models.User;
import ru.podol.tr_database.repozitories.CostomerRepozitory;
import ru.podol.tr_database.repozitories.OrdersRepozitory;
import ru.podol.tr_database.repozitories.UsersRepozitory;
import ru.podol.tr_database.repozitories.ProductRepozitory;


import java.util.List;

@Controller
public class UsersController {
    @Autowired
    private UsersRepozitory usersRepozitory;
    @Autowired
    private ProductRepozitory productsRepozitory;
    @Autowired
    private OrdersRepozitory ordersRepozitory;
    @Autowired
    private CostomerRepozitory costomerRepozitory;
    @GetMapping("/users")
    public String getUsersPage(Model model){
        List<User> users = usersRepozitory.findAll();
        model.addAttribute("users",users);
        List<Product> products = productsRepozitory.findAll();
        model.addAttribute("products",products);
        List<Order> orders = ordersRepozitory.findAll();
        model.addAttribute("orders",orders);
        List<Costomer> costomers = costomerRepozitory.findAll();
        model.addAttribute("costomers",costomers);
        return "users_page";
    }

}
