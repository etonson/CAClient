package com.demo.param;

import lombok.Getter;

/*
    @author : Eton.lin
    @description TODO
    @date 2024-11-07 下午 02:00
*/
@Getter
public enum Methods {
    GET(0, "GET"),
    POST(1, "POST");

    private int no;
    private String method;

    Methods(int no, String method) {
        this.no = no;
        this.method = method;
    }
}
