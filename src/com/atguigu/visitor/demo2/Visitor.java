package com.atguigu.visitor.demo2;

public interface Visitor {

    // ���ʹ���ʦ����
    void vistt(Engineer engineer);

    // ���ʾ�������
    void vistt(Manager manager);
}
