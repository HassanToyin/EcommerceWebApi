package com.Ecommerces.TcFootwear.controller;

import com.Ecommerces.TcFootwear.dto.OrderItemDTO;
import com.Ecommerces.TcFootwear.model.OrderItem;
import com.Ecommerces.TcFootwear.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order item")
public class OrderItemController {

    private final OrderItemService orderItemService;

    @Autowired
    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @GetMapping("/get")
    public List<OrderItem> getAllOrderItems() {
        return orderItemService.getAllOrderItems();
    }
    @GetMapping("/get/{id}")
    public Object GetOrderItemById(@PathVariable Long id)
    {return orderItemService.getOrderItemById(id);}

    @PostMapping
    public ResponseEntity<OrderItem> createOrderItem(@RequestBody OrderItem orderItem) {
        OrderItem createdOrderItem = orderItemService.createOrderItem(orderItem);
        return new ResponseEntity<>(createdOrderItem, HttpStatus.CREATED);
    }
}
