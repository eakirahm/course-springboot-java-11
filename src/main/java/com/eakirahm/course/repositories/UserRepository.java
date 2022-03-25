package com.eakirahm.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eakirahm.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
