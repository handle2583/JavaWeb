package com.example.elasticsearch.repository.impl;

import com.example.elasticsearch.entity.User;
import com.example.elasticsearch.mapper.UserRowMapper;
import com.example.elasticsearch.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(User user) {
        return jdbcTemplate.update("INSERT INTO users (name ,password,age)values(?,?,?)", user.getName(),
                user.getPassword(), user.getAge());
    }

    @Override
    public int update(User user) {
        return
                jdbcTemplate.update("UPDATE users set name = ? ,password =?,age =? where id = ? ", user.getName(), user.getPassword(), user.getAge(), user.getId());
    }

    @Override
    public int delete(long id) {
        return
                jdbcTemplate.update("DELETE FROM users where id =?", id);
    }

    @Override
    public List<User> findAll() {

        return jdbcTemplate.query("SELECT * FROM users", new UserRowMapper());
    }

    @Override
    public User findById(long id) {


        return jdbcTemplate.queryForObject("SELECT * FROM users where id = ?",  new Object[]{id},new BeanPropertyRowMapper<User>(User.class));
    }
}
