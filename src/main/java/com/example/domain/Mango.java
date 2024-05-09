package com.example.domain;

import lombok.Data;

/**
 * @author zxl
 * @date 2024/3/18 22:42
 * @description TODO
 */
@Data
public class Mango extends Fruit {

    public Mango() {
        super.setName("芒果");
        super.setPrice(20);
    }

}
