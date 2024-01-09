package com.Ecommerces.TcFootwear.service;

import com.Ecommerces.TcFootwear.dto.OrderItemDTO;
import com.Ecommerces.TcFootwear.model.Order;
import com.Ecommerces.TcFootwear.model.OrderItem;
import com.Ecommerces.TcFootwear.model.Product;
import com.Ecommerces.TcFootwear.repository.OrderItemRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderItemService {
    private final OrderItemRepo orderItemRepo;

    public OrderItem createOrderItem (OrderItemDTO orderItemDTO, Product product, Order order) {
        OrderItem orderItem = new OrderItem();
        orderItem.setProduct(product);
        orderItem.setOrder(order);
        orderItem.setQuantity(orderItemDTO.getQuantity());
        orderItem.setSubtotal(orderItemDTO.getSubtotal());

        return orderItemRepo.save(orderItem);
    }

    public List<OrderItem> getAllOrderItems() {
        return getAllOrderItems();
    }

    public OrderItem createOrderItem(OrderItem orderItem) {
        return createOrderItem(null);
    }

    public OrderItem getOrderItemById(
            Long id) {
        return orderItemRepo.save(null);
    }
}
