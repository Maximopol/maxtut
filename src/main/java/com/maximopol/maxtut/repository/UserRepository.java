package com.maximopol.maxtut.repository;


import com.maximopol.maxtut.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    @Override
    List<User> findAll();
    User findUserById(Long id);
    User findUserByEmail(String email);
    User findUserByUsername(String username);
    User findUserByEmailOrUsername(String email, String username);
    void deleteByEmail(String email);
}
