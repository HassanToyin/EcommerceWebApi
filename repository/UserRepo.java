package com.Ecommerces.TcFootwear.repository;

import com.Ecommerces.TcFootwear.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
