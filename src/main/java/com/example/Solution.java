package com.example;

import com.example.domain.Apple;
import com.example.domain.Fruit;
import com.example.domain.Mango;
import com.example.domain.Strawberry;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxl
 * @date 2024/3/18 22:19
 * @description
 */
public class Solution {


    /**
     * 结算购买水果的总价
     * @param fruits    购买的水果
     * @param total     满减条件
     * @param reduce    满减金额
     * @return
     */
    public float account(List<Fruit> fruits, int total, int reduce) {
        if (fruits == null || fruits.size() == 0) {
            return 0;
        }
//        fruits.forEach(f -> {});
        float sum = 0f;
        for (Fruit fruit : fruits) {
            // 折扣前价格
            float temp = fruit.getPrice() * fruit.getNum();
            if (fruit.getDiscount() > 0) {
                temp = temp * fruit.getDiscount() / 10;
            }
            sum += temp;
        }

        // 满足满减条件
        if (total > 0 && sum >= total) {
            // 满减次数
            int time = (int) (sum / total);
            sum -= time * reduce;
        }
        return sum;
    }


    /**
     * 购买苹果和草莓的总价
     * @param appleNum          苹果重量
     * @param strawberryNum     草莓重量
     * @return
     */
    public float buyApplyAndStrawberry(int appleNum, int strawberryNum) {
        List<Fruit> fruits = new ArrayList<>(2);
        Fruit apple = new Apple();
        apple.setNum(appleNum);
        fruits.add(apple);

        Fruit strawberry = new Strawberry();
        strawberry.setNum(strawberryNum);
        fruits.add(strawberry);
        return account(fruits, 0, 0);
    }


    /**
     * 购买苹果、草莓和芒果的总价
     * @param appleNum
     * @param strawberryNum
     * @param mangoNum
     * @return
     */
    public float buyApplyAndStrawberryAndMango(int appleNum, int strawberryNum, int mangoNum) {
        List<Fruit> fruits = new ArrayList<>(3);
        Fruit apple = new Apple();
        apple.setNum(appleNum);
        fruits.add(apple);

        Fruit strawberry = new Strawberry();
        strawberry.setNum(strawberryNum);
        fruits.add(strawberry);

        Fruit mango = new Mango();
        mango.setNum(mangoNum);
        fruits.add(mango);

        return account(fruits, 0, 0);
    }


    /**
     * 购买苹果、草莓和芒果的总价
     * 其中草莓打 8 折
     * @param appleNum
     * @param strawberryNum
     * @param mangoNum
     * @return
     */
    public float buyApplyAndStrawberryAndMangoByDiscount(int appleNum, int strawberryNum, int mangoNum) {
        List<Fruit> fruits = new ArrayList<>(3);
        Fruit apple = new Apple();
        apple.setNum(appleNum);
        fruits.add(apple);

        Fruit strawberry = new Strawberry();
        strawberry.setNum(strawberryNum);
        strawberry.setDiscount(8);
        fruits.add(strawberry);

        Fruit mango = new Mango();
        mango.setNum(mangoNum);
        fruits.add(mango);

        return account(fruits, 0, 0);
    }


    /**
     * 购买苹果、草莓和芒果的总价
     * 满减
     * @param appleNum
     * @param strawberryNum
     * @param mangoNum
     * @return
     */
    public float buyApplyAndStrawberryAndMangoByReduce(int appleNum, int strawberryNum, int mangoNum) {
        List<Fruit> fruits = new ArrayList<>(3);
        Fruit apple = new Apple();
        apple.setNum(appleNum);
        fruits.add(apple);

        Fruit strawberry = new Strawberry();
        strawberry.setNum(strawberryNum);
        fruits.add(strawberry);

        Fruit mango = new Mango();
        mango.setNum(mangoNum);
        fruits.add(mango);

        return account(fruits, 100, 10);
    }





    public static void main(String[] args) {
        Solution solution = new Solution();

        float sum1 = solution.buyApplyAndStrawberry(10, 10);
        System.out.println("购买苹果和草莓的总价：" + sum1);

        float sum2 = solution.buyApplyAndStrawberryAndMango(10, 10, 10);
        System.out.println("购买苹果、草莓和芒果的总价：" + sum2);

        float sum3 = solution.buyApplyAndStrawberryAndMangoByDiscount(10, 9, 10);
        System.out.println("购买苹果、草莓和芒果的总价（折扣）：" + sum3);

        float sum4 = solution.buyApplyAndStrawberryAndMangoByReduce(10, 10, 10);
        System.out.println("购买苹果、草莓和芒果的总价（满减）：" + sum4);
    }

}

