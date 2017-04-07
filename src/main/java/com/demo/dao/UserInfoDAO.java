package com.demo.dao;

import com.demo.model.UserInfo;

import java.util.List;

public interface UserInfoDAO {

    public UserInfo findUserInfo(String userName);

    // [USER,AMIN,..]
    public List<String> getUserRoles(String userName);
}
