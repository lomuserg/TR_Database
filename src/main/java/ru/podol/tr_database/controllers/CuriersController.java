package ru.podol.tr_database.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.podol.tr_database.models.Order;
import ru.podol.tr_database.repozitories.OrdersRepozitory;

import java.util.List;

@Controller
public class CuriersController {
    @Autowired
    private OrdersRepozitory ordersRepozitory;
    @GetMapping("/curiers")
    public String getCuriersPage(Model model){
        List<Order> orders = ordersRepozitory.findAll();
        model.addAttribute("orders",orders);
        return "curier_page";
    }

}
