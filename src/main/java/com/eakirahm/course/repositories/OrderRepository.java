package com.eakirahm.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eakirahm.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
