package com.xiangwj.service;

public class MyService {
    private final String perfix;
    private final String surfix;
    public MyService(String perfix, String surfix){
        this.perfix = perfix;
        this.surfix = surfix;
    }
    public String wrap(String content){
        return perfix+content+surfix;
    }
}
