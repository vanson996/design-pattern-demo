package com.atguigu.visitor.demo2;

/**
 * CTO ������
 *
 * @author WYX
 * @date 2021/1/14
 */
public class CTOVisitor implements Visitor {
    @Override
    public void vistt(Engineer engineer) {
        System.out.println("����ʦ��" + engineer.name + " , �������� " + engineer.getCodeLines());
    }

    @Override
    public void vistt(Manager manager) {
        System.out.println("��Ʒ����" + manager.name + " ���²�Ʒ��������" + manager.getProducts());
    }
}
