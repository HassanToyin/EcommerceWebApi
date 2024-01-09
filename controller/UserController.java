package com.Ecommerces.TcFootwear.controller;

import com.Ecommerces.TcFootwear.dto.ApiResponse;
import com.Ecommerces.TcFootwear.dto.UserDTO;
import com.Ecommerces.TcFootwear.model.Order;
import com.Ecommerces.TcFootwear.model.User;
import com.Ecommerces.TcFootwear.repository.UserRepo;
import com.Ecommerces.TcFootwear.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    @PostMapping
    public ApiResponse<User> createUser(@RequestBody UserDTO userDTO) {

        Object userService = new Object();
        Class<?> createdUser;
        createdUser = userService.getClass();
        return new ApiResponse<>(HttpStatus.OK.value(), "user created successfully", createdUser);
    }

    @GetMapping
    public ApiResponse<List<User>> getAllUsers() {
        UserService userService = null;
        List<User> users = userService.getAllUsers();
        return new ApiResponse<>(HttpStatus.OK.value(),"users fetched successfully",users);
    }

    @GetMapping("/{id}")
    public ApiResponse<User> getUser(@PathVariable Long id){
        UserService userService = null;
        User user = userService.getUser();

        return new ApiResponse<>( HttpStatus.OK.value(), "user fetched successfully", (List<User>) user);
    }


}
