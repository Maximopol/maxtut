package com.maximopol.maxtut.service;

import com.maximopol.maxtut.entity.User;
import com.maximopol.maxtut.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public void printAllUser() {
        List<User> list = userRepository.findAll();

        for (User user : list
        ) {
            System.out.println(user);
        }

    }

    public User findUserById(Long id) {
        return userRepository.findUserById(id);
    }

    public boolean saveUser(User user) {
        boolean status = false;
        User user1 = userRepository.findUserByEmailOrUsername(user.getEmail(), user.getUsername());

        if (user1 != null) {
            userRepository.save(user);
            status = true;
        }

        return status;
    }

    public boolean deleteUser(String email) {
        if (userRepository.findUserByEmail(email) != null) {
            userRepository.deleteByEmail(email);
            return true;
        }
        return false;
    }

    public boolean deleteUser(Long id) {
        if (userRepository.findUserById(id) != null) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
