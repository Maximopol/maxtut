package com.maximopol.maxtut.service;

import com.maximopol.maxtut.comporator.users.UserEmailComparator;
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

        list.sort(new UserEmailComparator());
        list.forEach(System.out::println);
    }

    public User findUserById(Long id) {
        return userRepository.findUserById(id);
    }

    public User findUserByEmail(String email){
        return userRepository.findUserByEmail(email);
    }
    public User findUserByEmailOrUsername(String email, String username){
        return userRepository.findUserByEmailOrUsername(email, username);
    }

    public boolean saveUser(User user) {
        boolean status = false;
        User user1 = userRepository.findUserByEmailOrUsername(user.getEmail(), user.getUsername());
        System.out.println("==========================");
        System.out.println(user);
        System.out.println(user.getConfirmPassword());
        System.out.println("==========================");
        System.out.println(user1);
        System.out.println(user.getConfirmPassword());
        System.out.println("==========================");
        if (user1 == null) {
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
