package com.atguigu.visitor.demo2;

import java.util.Random;

/**
 * @author WYX
 * @date 2021/1/14
 */
// 经理
public class Manager extends Staff {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.vistt(this);
    }

    // 一年做的产品数量
    public int getProducts() {
        return new Random().nextInt(10);
    }
}
