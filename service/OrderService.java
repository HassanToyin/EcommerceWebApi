package com.Ecommerces.TcFootwear.service;

import com.Ecommerces.TcFootwear.dto.OrderRequestDTO;
import com.Ecommerces.TcFootwear.model.Order;
import com.Ecommerces.TcFootwear.repository.OrderRepo;
import com.fasterxml.jackson.annotation.JacksonInject;
import org.springframework.stereotype.Service;

@Service

public class OrderService {
    private final OrderRepo orderRepo;

    public  OrderService(OrderRepo orderRepo){
        this.orderRepo = orderRepo;
    }

    public Object createOrder(OrderRequestDTO orderDTO){
        Order order = new Order();

        orderDTO.setCustomerId(orderDTO.getCustomerId());
        orderDTO.setProducts(orderDTO.getProducts());

        return orderRepo.save(order);
    }

    public Object updateOrder(OrderRequestDTO orderDTO, Long id){
        Order order =orderRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Order with id" +orderDTO.getCustomerId() + "not found"));
        orderDTO.setCustomerId(orderDTO.getCustomerId());
        orderDTO.setProducts(orderDTO.getProducts());

        return orderRepo.save(order);

    }

    public Object getOrderById(Long id){
        return  orderRepo.findById(id);
    }

    public  Object getOrder(){
        return orderRepo.findAll();
    }

    public Object deleteOrder(OrderRequestDTO orderDto, Long id){
        JacksonInject.Value orderDTO;
        orderDTO = null;
        Order order = orderRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Order with id" +orderDTO.getId() + "not found" ));

        orderRepo.delete(order);
        return "Order deleted successfully";
    }



    }
