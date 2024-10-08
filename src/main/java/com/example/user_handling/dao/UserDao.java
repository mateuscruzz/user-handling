package com.example.user_handling.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user_handling.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{

}
