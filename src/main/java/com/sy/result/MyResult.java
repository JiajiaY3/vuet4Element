package com.sy.result;

import lombok.Data;

@Data
public class MyResult {
    /**
     * 返回编码 code
     *  200 404
     */
    private Integer code;
    /**
     * 返回信息 msg
     */
    private String msg;
    /**
     * 返回数据 data
     */
    private Object data;

    public static MyResult init(int code,String msg,Object data){
        MyResult myResult = new MyResult();
        myResult.code=code;
        myResult.msg=msg;
        myResult.data=data;
        return myResult;
    }


}
