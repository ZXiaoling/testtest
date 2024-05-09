package com.example.domain;

import lombok.Data;

/**
 * @author zxl
 * @date 2024/3/18 22:43
 * @description
 */
@Data
public class Strawberry extends Fruit {

    public Strawberry() {
        super.setName("草莓");
        super.setPrice(13);
    }


}
