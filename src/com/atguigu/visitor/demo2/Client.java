package com.atguigu.visitor.demo2;

/**
 * @author WYX
 * @date 2021/1/14
 */
public class Client {
    public static void main(String[] args) {
        // ��������
        BusinessReport report = new BusinessReport();
        System.out.println("=========== CEO������ ===========");
        report.showReport(new CEOVisitor());
        System.out.println("=========== CTO������ ===========");
        report.showReport(new CTOVisitor());
    }
}
