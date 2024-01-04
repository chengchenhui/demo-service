package com.szewec.controller;


import com.szewec.model.UserModel;
import com.szewec.service.impl.userServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    userServiceImpl usimpl;
    /**
     * 分页查询user
     */
    @ApiOperation(value = "分页查询用户列表")
    @RequestMapping("/search")
    public void searchUsersByPage(int pageIndex, int pageSize, UserModel user){




    }


    /**
     * 新增user
     */
    @ApiOperation(value = "新增用户")
    @RequestMapping("/addUser")
    public void addUser(UserModel user){

    }

    /**
     * 修改user
     */
    @ApiOperation(value = "更新用户")
    @RequestMapping("/updateUser")
    public void updateUser(UserModel user){

    }

    /**
     * 删除user
     */
    @ApiOperation(value = "删除用户")
    @RequestMapping("/deleteUser")
    public void deleteUser(String id){

    }


}
