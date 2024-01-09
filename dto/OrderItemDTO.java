package com.Ecommerces.TcFootwear.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data

public class OrderItemDTO {
    @NonNull private Long productId;
    @NonNull private Integer quantity;
    private Double subtotal;
}
