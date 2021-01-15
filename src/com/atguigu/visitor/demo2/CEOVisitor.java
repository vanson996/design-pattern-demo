package com.atguigu.visitor.demo2;

/**
 * CEO 访问者
 * @author WYX
 * @date 2021/1/14
 */
public class CEOVisitor implements Visitor {
    @Override
    public void vistt(Engineer engineer) {
        System.out.println("工程师：" + engineer.name + " , kpi： " + engineer.kpi);
    }

    @Override
    public void vistt(Manager manager) {
        System.out.println("产品经理：" + manager.name + " , kpi： " + manager.kpi + " ，新产品的数量：" + manager.getProducts());
    }
}
