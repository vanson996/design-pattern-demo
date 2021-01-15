package com.atguigu.visitor.demo2;

import java.util.Random;

/**
 * @author WYX
 * @date 2021/1/14
 */
// Ա������
public abstract class Staff {

    public String name;
    public int kpi;

    public Staff(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }

    // ���ķ���������visiter�ķ���
    public abstract void accept(Visitor visitor);
}
