package com.xusong.util;


import com.jfinal.kit.Ret;

/**
 * describe :
 * author : xusong
 * createTime : 2018/6/29
 */
public class MyRet extends Ret{
    public static Ret myOk(Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        return Ret.ok(simpleName, obj);
    }

}
