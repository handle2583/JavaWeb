package com.didi.thinking;

import java.util.HashMap;
import java.util.Map;

public class Student {
    //姓名
    private String name;
    //性别
    private String sex;
    //身份证号
    private String idCard;
    Student(String name,String sex,String idCard){
        this.name = name;
        this.sex = sex;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getIdCard() {
        return idCard;
    }
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(obj == null){
            return false;
        }
        Student obj1 = (Student)obj;
        if(this.name.equals(obj1.getName()) && this.idCard.equals(obj1.getIdCard())){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        String s= this.name + this.idCard;
        return s.hashCode();
    }




    public static void main(String[] args) throws Exception {
        Map<Student,Student> map = new HashMap<Student,Student>();
        Student s1 = new Student("haly","male","110200");
        Student s2 = new Student("haly","female","110200");
        map.put(s1, s1);
     
        System.out.println(map.get(s2));

        // 当没有重写equals方法和hashcode方法，打印出null
        // 当重写equals方法，不重写hashcode方法时，打印出null
        // 当重写equals方法,并且重写hashcode方法时,打印出com.test.Student@95fb7d6

    }
}
