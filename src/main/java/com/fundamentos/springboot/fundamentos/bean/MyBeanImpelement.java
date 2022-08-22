package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanImpelement implements MyBean{

    @Override
    public void print() {
        System.out.println("Hello implemention Bean");
    }
}
