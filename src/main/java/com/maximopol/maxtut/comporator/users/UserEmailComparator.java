package com.maximopol.maxtut.comporator.users;

import com.maximopol.maxtut.entity.User;

import java.util.Comparator;

public class UserEmailComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getEmail().compareTo(o2.getEmail());
      //   алфавитная сортировка
    }
}
