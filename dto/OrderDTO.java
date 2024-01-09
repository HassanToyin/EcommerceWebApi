package com.Ecommerces.TcFootwear.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor

public class OrderDTO {

    private Long id;
    private LocalDateTime orderDate;
    private Double totalAmount;
    private List<OrderItemDTO> orderItems;


}
