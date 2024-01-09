package com.Ecommerces.TcFootwear.repository;

import com.Ecommerces.TcFootwear.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
