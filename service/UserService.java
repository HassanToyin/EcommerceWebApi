package com.Ecommerces.TcFootwear.service;

import com.Ecommerces.TcFootwear.dto.UserDTO;
import com.Ecommerces.TcFootwear.model.User;
import com.Ecommerces.TcFootwear.repository.UserRepo;
import lombok.AllArgsConstructor;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public User createCustomer(UserDTO userDto) {
        User user = new User();

        user.setName(userDto.getName());
        user.setAddress(userDto.getAddress());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setEmail(userDto.getEmail());

        return userRepo.save(user);

    }

    public List<User> getAllUsers() {
        return getAllUsers();

    }

    public User getUser() {
        return getUser();
    }
}
