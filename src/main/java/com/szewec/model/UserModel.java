package com.szewec.model;

import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户实体")
@TableName("p_user")
public class UserModel {
    @ApiModelProperty(value = "用户ID标识",name = "id")
    private String fid;
    @ApiModelProperty(value = "姓名",name = "name")
    private String name;
    @ApiModelProperty(value = "年龄",name = "age")
    private Integer age;
    @ApiModelProperty(value = "性别",name = "sex")
    private String sex;
    @ApiModelProperty(value = "地址",name = "address")
    private String address;

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
