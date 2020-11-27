package com.example.elasticsearch.entity;

import com.example.elasticsearch.enums.MybatisUserSexEnum;

public class MybatisUser {
    private Long id;
    private String userName;
    private String passWord;
    private MybatisUserSexEnum userSex;
    private String nickName;

    public MybatisUser() {
        super();
    }

    public MybatisUser(String userName, String passWord, MybatisUserSexEnum userSex) {
        super();
        this.passWord = passWord;
        this.userName = userName;
        this.userSex = userSex;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public MybatisUserSexEnum getUserSex() {
        return userSex;
    }

    public void setUserSex(MybatisUserSexEnum userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userSex=" + userSex +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
