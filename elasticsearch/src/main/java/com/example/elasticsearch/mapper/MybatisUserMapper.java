package com.example.elasticsearch.mapper;

import com.example.elasticsearch.entity.MybatisUser;

import java.util.List;

public interface MybatisUserMapper {
    List<MybatisUser> getAll();

    MybatisUser getOne(Long id);

    void insert(MybatisUser user);

    void update(MybatisUser user);

    void delete(Long id);

}
