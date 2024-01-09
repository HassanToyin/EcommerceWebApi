package com.Ecommerces.TcFootwear.controller;

import com.Ecommerces.TcFootwear.dto.ApiResponse;
import com.Ecommerces.TcFootwear.dto.ProductDTO;
import com.Ecommerces.TcFootwear.model.Product;
import com.Ecommerces.TcFootwear.model.User;
import com.Ecommerces.TcFootwear.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Product> createTcFootwear(@RequestBody ProductDTO productDTO) {
        Product createdProduct = productService.createTcFootwear(productDTO);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }


    @GetMapping("")
    public ResponseEntity<List<Product>> getAllTcFootwear() {
        List<Product> products = productService.getAllTcFootwear();
        return new ResponseEntity<>(products, HttpStatus.OK);

    }

    @GetMapping("")
    public ResponseEntity<Product> getProductById(@PathVariable Long id){
        Product product = productService.getTcFootwearById(id);
        return new ResponseEntity<>(product, HttpStatus.OK) ;

    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@RequestBody ProductDTO productDTO, @PathVariable Long id){
        Product updatedProduct = productService.updateProduct(productDTO, id);
        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);

    }

    @DeleteMapping("/{id")
    public ResponseEntity<Product> deleteProduct(@PathVariable Long id){
        Product deletedProduct = ProductService.deleteProduct(id);
        return new ResponseEntity<>(deletedProduct, HttpStatus.OK);
    }



}
