package com.eakirahm.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eakirahm.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
