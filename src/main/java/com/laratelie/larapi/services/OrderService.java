package com.laratelie.larapi.services;

import com.laratelie.larapi.models.CustomerOrder;
import com.laratelie.larapi.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void registerOrder(CustomerOrder customerOrder){
        customerOrder.setCreatedAt(LocalDateTime.now());
        orderRepository.save(customerOrder);
    }

    public List<CustomerOrder> getAllOrders() {
        return orderRepository.findAll();
    }

//    public CustomerOrder getOrdersByClient(String client){
//        return orderRepository.findByClient(client);
//    }

    public void deleteOrder(UUID id) {
        orderRepository.deleteById(id);
    }

    //TODO: Update order
}
