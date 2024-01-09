package com.Ecommerces.TcFootwear.repository;

import com.Ecommerces.TcFootwear.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
