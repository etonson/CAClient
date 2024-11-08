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

    private int no;
    private String method;

    Heads(int no, String method) {
        this.no = no;
        this.method = method;
    }
}