package com.lcwd.orm.service;

import com.lcwd.orm.entities.User;

import java.util.List;

//loose coupling  ke liye hmne user interface bnaya
public interface userservice {
    public User saveuser(User user);
    User updateuser(User user,int id);
    List<User> getAllUser();
    User getSingleUser(int id);

    void deleteUser(int id);


}
