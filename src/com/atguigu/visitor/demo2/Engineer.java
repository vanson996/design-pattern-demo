package com.atguigu.visitor.demo2;

import java.util.Random;

/**
 * @author WYX
 * @date 2021/1/14
 */
// ����ʦ
public class Engineer extends Staff {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.vistt(this);
    }

    // ����ʦһ��Ĵ�������
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
