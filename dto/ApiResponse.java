package com.Ecommerces.TcFootwear.dto;

import com.Ecommerces.TcFootwear.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor @AllArgsConstructor
public class ApiResponse<o> {
    @NonNull private Integer statusCode;
    @NonNull private String message;
    private int data;

    public ApiResponse(int value, String productUpdatedSuccessfully, Class<?> updatedProduct) {
    }

    public ApiResponse(int value, String userDeletedSuccessfully, List<User> user) {
    }


}
