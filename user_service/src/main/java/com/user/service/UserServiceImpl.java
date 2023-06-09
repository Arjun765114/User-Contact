package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

   //fake User List

   List<User>list= Arrays.asList(new User(1313L,"Yug Thakre", "915856"),new User(1311L,"Arjun Thakre", "915863"),new User(1312L,"Bhavesh Thakre","3453435"));



    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
