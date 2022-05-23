package com.dmitriev.crud1.repository;

import com.dmitriev.crud1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<User, Long> {
}
