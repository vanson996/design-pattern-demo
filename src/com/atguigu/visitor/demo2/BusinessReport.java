package com.atguigu.visitor.demo2;

import java.util.LinkedList;
import java.util.List;

/**
 * Ա��ҵ�񱨱���
 *
 * @author WYX
 * @date 2021/1/14
 */
public class BusinessReport {

    private List<Staff> mStaffs = new LinkedList<>();

    public BusinessReport() {
        mStaffs.add(new Manager("����-A"));
        mStaffs.add(new Engineer("����ʦ-A"));
        mStaffs.add(new Engineer("����ʦ-B"));
        mStaffs.add(new Engineer("����ʦ-C"));
        mStaffs.add(new Manager("����-B"));
        mStaffs.add(new Engineer("����ʦ-D"));
    }

    /**
     * Ϊ������չʾҵ�񱨱�
     *
     * @param visitor ��˾�߲㣬��CEO��CTO
     */
    public void showReport(Visitor visitor) {
        for (Staff staff : mStaffs) {
            staff.accept(visitor);
        }
    }
}
