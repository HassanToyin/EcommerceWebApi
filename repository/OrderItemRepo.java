package com.Ecommerces.TcFootwear.repository;

import com.Ecommerces.TcFootwear.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepo extends JpaRepository<OrderItem, Long> {
}
