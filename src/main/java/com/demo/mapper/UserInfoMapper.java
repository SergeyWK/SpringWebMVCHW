package com.demo.mapper;

import com.demo.model.UserInfo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInfoMapper implements org.springframework.jdbc.core.RowMapper<UserInfo> {

    public UserInfo mapRow(ResultSet rs, int i) throws SQLException {
        String userName = rs.getString("Username");
        String password = rs.getString("Password");

        return new UserInfo(userName, password);
    }
}
