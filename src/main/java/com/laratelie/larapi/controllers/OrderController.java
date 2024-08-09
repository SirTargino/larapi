package com.laratelie.larapi.controllers;

import com.laratelie.larapi.models.CustomerOrder;
import com.laratelie.larapi.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public void createOrder(@RequestBody CustomerOrder customerOrder){
        orderService.registerOrder(customerOrder);
    }

    @GetMapping
    public ResponseEntity<List<CustomerOrder>> getAllOrders(){
        List<CustomerOrder> orders = orderService.getAllOrders();
        return ResponseEntity.ok(orders);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable UUID id){
        orderService.deleteOrder(id);
    }
}
