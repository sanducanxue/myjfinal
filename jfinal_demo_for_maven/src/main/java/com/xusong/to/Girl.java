package com.xusong.to;

import lombok.Data;

/**
 * describe :
 * author : xusong
 * createTime : 2018/6/29
 */
@Data
public class Girl {
    private Integer id;
    private String name;
    private Integer age;

    public Girl(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Girl() {
    }
}
