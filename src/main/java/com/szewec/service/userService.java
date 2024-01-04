package com.szewec.service;


import com.szewec.model.UserModel;

public interface userService {
    public void searchUsersByPage(int pageIndex, int pageSize, UserModel user);
    public void addUser(UserModel user);
    public void updateUser(UserModel user);
    public void deleteUser(String id);
}
