package com.jason.wj.service;

import com.jason.wj.dao.AdminMenuDAO;
import com.jason.wj.pojo.AdminMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminMenuService {

    @Autowired
    AdminMenuDAO adminMenuDAO;

 public    List<AdminMenu> findAllById(List<Integer>  ids  ){

     return  adminMenuDAO.findAllByIdIn(ids) ;


 } ;
 public List<AdminMenu> getAllByParentId(int id){

     return adminMenuDAO.findAllByParentId(id) ;

 }

}
