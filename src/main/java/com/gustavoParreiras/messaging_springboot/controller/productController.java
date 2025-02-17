package com.gustavoParreiras.messaging_springboot.controller;

import com.gustavoParreiras.messaging_springboot.domain.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Pizzaria/Product")
public class productController {
    @PostMapping(name = "/Order")
    public String Order(@RequestBody Order order) {

    }

    @GetMapping(name = "/Orders")
    public List<Order> getOrders() {

    }
}
