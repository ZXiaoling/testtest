package com.example.domain;

import lombok.Data;

/**
 * @author zxl
 * @date 2024/3/18 22:33
 * @description TODO
 */
@Data
public class Fruit {

    /**
     * 水果名称
     */
    private String name;

    /**
     * 水果单价
     */
    private int price;

    /**
     * 折扣
     * (1, 10)
     * 0 表示不打折
     */
    private int discount;

    /**
     * 数量
     */
    private int num;

}
