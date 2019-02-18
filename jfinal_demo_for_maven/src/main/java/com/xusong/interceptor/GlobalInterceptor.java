package com.xusong.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * describe :全局拦截器
 * author : xusong
 * createTime : 2018/6/29
 */
public class GlobalInterceptor implements Interceptor {
    public void intercept(Invocation invocation) {
        //获取到被拦截方法的全部参数
        System.out.println("11111111111111111");
        invocation.invoke();
        System.out.println("222222222222222222");
    }
}
