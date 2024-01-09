package com.Ecommerces.TcFootwear.controller;

import com.Ecommerces.TcFootwear.dto.ApiResponse;
import com.Ecommerces.TcFootwear.dto.OrderRequestDTO;
import com.Ecommerces.TcFootwear.dto.OrderResponseDTO;
import com.Ecommerces.TcFootwear.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping(value = "/create")
    public Object createOrder(@RequestBody OrderRequestDTO orderRequestDto) {

        return orderService.createOrder(orderRequestDto);
    }

    @GetMapping
    public ResponseEntity<List<OrderRequestDTO>> getAllOrders() {
        return ResponseEntity.ok().build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<List<OrderRequestDTO>> getOrderById(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }



}
