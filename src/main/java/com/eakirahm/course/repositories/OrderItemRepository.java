package com.eakirahm.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eakirahm.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
