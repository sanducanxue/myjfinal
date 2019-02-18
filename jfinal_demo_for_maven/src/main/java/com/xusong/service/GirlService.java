package com.xusong.service;
import com.jfinal.aop.Before;
import com.xusong.interceptor.GlobalInterceptor;
import com.xusong.model.Girl;
/**
 * describe :
 * author : xusong
 * createTime : 2018/6/29
 */
public class GirlService {
    public static final GirlService me = new GirlService();
    private Girl dao = Girl.dao;

    @Before(GlobalInterceptor.class)
    public Girl selectById(Integer id){
        return dao.findById(id);
    }

    public boolean delById(Integer id){
        return dao.deleteById(id);
    }
}
