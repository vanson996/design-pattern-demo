package com.atguigu.visitor.demo2;

public interface Visitor {

    // 访问工程师类型
    void vistt(Engineer engineer);

    // 访问经理类型
    void vistt(Manager manager);
}
