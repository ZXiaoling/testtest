package com.example.domain;

import lombok.Data;

/**
 * @author zxl
 * @date 2024/3/18 22:38
 * @description TODO
 */
@Data
public class Apple extends Fruit {


    public Apple() {
        super.setName("苹果");
        super.setPrice(8);
    }


}
