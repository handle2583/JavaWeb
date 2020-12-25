package com.jason.wj.service;

import com.jason.wj.dao.AdminUserRoleDAO;
import com.jason.wj.pojo.AdminUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminUserRoleService {


    @Autowired
    AdminUserRoleDAO adminUserRoleDAO ;



    public List<AdminUserRole> listAllByUid(int id){


   return adminUserRoleDAO.findAllByUid(id) ;
    }

}
