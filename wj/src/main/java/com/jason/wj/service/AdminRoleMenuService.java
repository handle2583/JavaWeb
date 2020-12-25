package com.jason.wj.service;

import com.jason.wj.dao.AdminRoleMenuDAO;
import com.jason.wj.pojo.AdminRoleMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminRoleMenuService {

    @Autowired
    AdminRoleMenuDAO adminRoleMenuDAO ;



    public List<AdminRoleMenu> findAllByRid(List<Integer> rids) {

        return adminRoleMenuDAO.findAllByRidIn(rids ) ;
    }
}
