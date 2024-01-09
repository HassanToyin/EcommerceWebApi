package com.Ecommerces.TcFootwear.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor @NoArgsConstructor
public class OrderItemRequestDTO {
    @NonNull private Long productId;
    @NonNull private Integer quantity;
}

