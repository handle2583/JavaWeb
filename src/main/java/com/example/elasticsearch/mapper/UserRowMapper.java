package com.example.elasticsearch.mapper;

import com.example.elasticsearch.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class UserRowMapper implements RowMapper<User> {


    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
       User user = new User() ;
       user.setId(resultSet.getLong("id"));
       user.setName(resultSet.getString("name"));
       user.setAge(resultSet.getInt("age"));
       user.setPassword(resultSet.getString("password"));

        return user;
    }
}
