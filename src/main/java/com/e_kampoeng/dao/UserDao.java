package com.e_kampoeng.dao;


import com.e_kampoeng.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserModel, Integer> {
    UserModel findByUsername(String username);

    UserModel findById(long userId);
}