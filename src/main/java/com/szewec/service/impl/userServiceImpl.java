package com.szewec.service.impl;

import com.szewec.model.UserModel;
import com.szewec.service.userService;

import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {
    @Override
    public void searchUsersByPage(int pageIndex, int pageSize, UserModel user) {
        System.out.println();
    }

    @Override
    public void addUser(UserModel user) {

    }

    @Override
    public void updateUser(UserModel user) {

    }

    @Override
    public void deleteUser(String id) {

    }
}
