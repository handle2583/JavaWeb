package com.didi.test;

public class A {


    Interface2 getA(){


      return new Interface2(){

          @Override
          public void method1() {
              System.out.println("method1");
          }

          @Override
          public void method2() {
              System.out.println("method2");
          }

          @Override
          public void method3() {
              System.out.println("method3");
          }
      };


    }
}
