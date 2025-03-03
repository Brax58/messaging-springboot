package com.gustavoParreiras.messaging_springboot.service;

import com.gustavoParreiras.messaging_springboot.domain.Order;
import com.gustavoParreiras.messaging_springboot.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order findOrderById(String id) {
        return orderRepository.findById(id).get();
    }

    public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }
}
