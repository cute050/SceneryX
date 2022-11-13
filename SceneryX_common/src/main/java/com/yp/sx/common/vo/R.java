package com.yp.sx.common.vo;

import com.yp.sx.common.type.RCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yp
 * @since 2022/11/12
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class R {

    private int code;

    private String msg;

    private Object data;

    public static R ok(String msg,Object data){
        return new R(RCode.OK.getValue(),msg,data);
    }

    public static R ok(Object data){
        return ok("OK",data);
    }

    public static R ok(){
        return ok(null);
    }


    public static R fail(int code,String msg,Object data){
        return new R(code,msg,data);
    }

    public static R fail(){
        return new R(RCode.FAIL.getValue(),"Fail",null);
    }
}
