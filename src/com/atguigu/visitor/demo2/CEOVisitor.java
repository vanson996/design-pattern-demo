package com.atguigu.visitor.demo2;

/**
 * CEO ������
 * @author WYX
 * @date 2021/1/14
 */
public class CEOVisitor implements Visitor {
    @Override
    public void vistt(Engineer engineer) {
        System.out.println("����ʦ��" + engineer.name + " , kpi�� " + engineer.kpi);
    }

    @Override
    public void vistt(Manager manager) {
        System.out.println("��Ʒ����" + manager.name + " , kpi�� " + manager.kpi + " ���²�Ʒ��������" + manager.getProducts());
    }
}
