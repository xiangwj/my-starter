package com.xiangwj.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my.start")
public class MyProperties {
    private String perfix = "defaultperfix";
    private String surfix = "defaultsurfix";

    public String getSurfix() {
        return surfix;
    }

    public void setSurfix(String surfix) {
        this.surfix = surfix;
    }

    public String getPerfix() {
        return perfix;
    }

    public void setPerfix(String perfix) {
        this.perfix = perfix;
    }



}
