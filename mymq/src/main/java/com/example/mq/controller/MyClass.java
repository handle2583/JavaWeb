package com.example.mq.controller;

import java.util.Random;

public class MyClass extends MyAbstractClass {


    final public int c = new Random().nextInt();
    public static final int d = new Random().nextInt() ;
    @Override
    void test() {
        System.out.println("MyClass");
    }

    public static void main(String[] args) {
//        MyClass myClass = new MyClass();
//
//        myClass.test();
//
//        MyAbstractClass myAbstractClass = myClass;
//        myAbstractClass.hello();
//        System.out.println(myAbstractClass.a);

        MyClass myClass = new MyClass()  ;
        MyClass myClass1  = new MyClass();

        System.out.println(myClass.c);//在类实例化的时候
        System.out.println(MyClass.d);//在装载时就初始化
        System.out.println(myClass1.c);
        System.out.println(MyClass.d);
    }
}
