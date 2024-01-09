package com.Ecommerces.TcFootwear.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class OrderRequestDTO {
    private Long customerId;
    private ArrayList<OrderItemRequestDTO> products;
}
