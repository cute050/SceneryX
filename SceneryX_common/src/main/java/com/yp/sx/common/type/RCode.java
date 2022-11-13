package com.yp.sx.common.type;

public enum RCode {

    OK(10000),FAIL(10001),LOGIN_ERROR(10002);
    private int value;

    public int getValue(){
        return value;
    }

    private RCode(int v){
        value = v;
    }
}
