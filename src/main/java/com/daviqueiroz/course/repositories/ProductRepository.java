package com.daviqueiroz.course.repositories;

import com.daviqueiroz.course.entities.Order;
import com.daviqueiroz.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
