package com.Ecommerces.TcFootwear.service;

import com.Ecommerces.TcFootwear.dto.ProductDTO;
import com.Ecommerces.TcFootwear.model.Product;
import com.Ecommerces.TcFootwear.repository.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class ProductService {
    private static ProductRepo productRepo;

    public static Product deleteProduct(Long id) {
        return null;
    }

    public Product createTcFootwear(ProductDTO productDTO) {
        Product product = new Product();

        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(String.valueOf(productDTO.getPrice()));
        product.setStockQuantity(String.valueOf(productDTO.getStockQuantity()));

        return productRepo.save(product);
    }

    public Product getTcFootwearById(Long id) {
        return productRepo.findById(id).orElseThrow( () -> new RuntimeException("TcFootwear not found"));
    }

    public ArrayList<Product> getAllTcFootwear(){
        return (ArrayList<Product>) productRepo.findAll();
    }

    public Product updateTcFootwear(ProductDTO productDTO, Long id){
        Product product = productRepo.findById(id).orElseThrow(() -> new RuntimeException("TcFootwear not found"));

        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(String.valueOf(productDTO.getPrice()));
        product.setStockQuantity(productDTO.setStockQuantity());

        return productRepo.save(product);
    }

    public static Product deleteTcFootwear(Long id) {
        Product product = productRepo.findById(id).get();
        productRepo.deleteById(id);
        return product;
    }


    public Product updateProduct(ProductDTO productDTO, Long id) {
        return null;
    }
}
