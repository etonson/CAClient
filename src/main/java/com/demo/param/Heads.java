package com.demo.param;

import lombok.Getter;

/*
    @author : Eton.lin
    @description TODO
    @date 2024-11-07 下午 02:40
*/
@Getter
public enum Heads {
    XML(0, "text/xml;charset=utf-8"),
    JSON(1, "application/json;charset=utf-8");

    private final int NO;
    private final String METHOD;

    Heads(int no, String method) {
        this.NO = no;
        this.METHOD = method;
    }
}