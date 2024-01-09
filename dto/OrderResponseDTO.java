package com.Ecommerces.TcFootwear.dto;

import com.Ecommerces.TcFootwear.model.OrderItem;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor

public class OrderResponseDTO {
    private Long id;
    private Long customerId;
    private LocalDateTime orderDate;
    private Double totalAmount;
    private List<OrderItem> orderItems;
}
