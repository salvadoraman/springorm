package com.lcwd.orm.service.impl;

import com.lcwd.orm.entities.User;
import com.lcwd.orm.repository.UserRepository;
import com.lcwd.orm.service.userservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Userimpl implements userservice {
   Logger logger= LoggerFactory.getLogger(Userimpl.class);
    @Autowired
    private UserRepository userrepository;
    @Override
    public User saveuser(User user) {
       User user1= userrepository.save(user);

       logger.warn("User save{}",user1);
       return user1;
    }

    @Override
    public User updateuser(User user, int id) {
        //take out user from database
        User olduser=userrepository.findById(id).orElseThrow(()->new RuntimeException("user with given id not found"));
        olduser.setName(user.getName());
        olduser.setAge(user.getAge());
        olduser.setCity(user.getCity());
        //now save it to repositry
        User u1=userrepository.save(olduser);

        return u1;
    }

    @Override
    public List<User> getAllUser() {
      List<User>u=  userrepository.findAll();
      return u;
    }

    @Override
    public User getSingleUser(int id) {
       Optional<User> useroptional= userrepository.findById(id);
       User user12=useroptional.orElseThrow(()->new RuntimeException("user with given id not found"));
       return user12;
    }

    @Override
    public void deleteUser(int id) {
        User user=userrepository.findById(id).orElseThrow(()->new RuntimeException("user not found"));
        userrepository.delete(user);
        logger.info("user deleted");
    }
}
