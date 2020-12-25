package com.jason.wj.dao;

import com.jason.wj.pojo.AdminMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminMenuDAO extends JpaRepository<AdminMenu, Integer> {

    List<AdminMenu> findAllByIdIn(List<Integer> ids);

    List<AdminMenu> findAllByParentId(int parentId);
}
