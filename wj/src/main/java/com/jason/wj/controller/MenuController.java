package com.jason.wj.controller;

import com.jason.wj.pojo.AdminMenu;
import com.jason.wj.service.AdminMenuService;
import com.jason.wj.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class MenuController {

    @Autowired
    AdminService adminService ;

    @GetMapping("/api/menu")
    public List<AdminMenu> menu() {
        System.out.println("menu");
        return adminService.getMenusByCurrentUser();
    }



}
