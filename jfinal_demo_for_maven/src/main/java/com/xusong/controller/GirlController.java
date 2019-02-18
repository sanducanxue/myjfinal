package com.xusong.controller;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.xusong.interceptor.GlobalInterceptor;
import com.xusong.model.Girl;
import com.xusong.service.GirlService;
import com.xusong.util.MyRet;
/**
 * describe :
 * author : xusong
 * createTime : 2018/6/29
 */
public class GirlController  extends Controller {
    private GirlService girlService = GirlService.me;
    public void findGirl(){
        //获取url中的第一个参数转换为int类型
        Integer id = getParaToInt(0);
        Girl girl = girlService.selectById(id);
        renderJson(MyRet.myOk(girl));
    }

    public void saveGirl(){
        Girl girl = getBean(Girl.class);
        new Girl().setAge(12).setId(3).setName("aaa").save();

        girl.save();
    }
}
