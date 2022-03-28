package com.eakirahm.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eakirahm.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
