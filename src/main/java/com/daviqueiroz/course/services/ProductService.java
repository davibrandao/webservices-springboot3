package com.daviqueiroz.course.services;

import com.daviqueiroz.course.entities.Category;
import com.daviqueiroz.course.entities.Product;
import com.daviqueiroz.course.repositories.CategoryRepository;
import com.daviqueiroz.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}
