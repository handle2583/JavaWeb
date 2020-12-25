package com.jason.wj.dao;

import com.jason.wj.entity.User;
import com.jason.wj.pojo.AdminUserRole;
import com.jason.wj.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminUserRoleDAO  extends JpaRepository<AdminUserRole,Integer> {
    List<AdminUserRole>  findAllByUid(int uid) ;
}
