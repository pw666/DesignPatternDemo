package com.wp.pattern;

import com.wp.pattern.behaviour.StrategyPattern.SalesMan;

/**
 * @author pan.wu
 * @date 2019/12/19 17:15
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("策略模式测试>>>>>>>>");
        StrategyPatternTest();
        //...
    }

    /**
     * 策略模式测试
     */
    static void StrategyPatternTest() {
        SalesMan mSalesMan;
        //春节来了，使用春节促销活动
        System.out.println("对于春节：");
        mSalesMan = new SalesMan("A");
        mSalesMan.SalesManShow();

        //中秋节来了，使用中秋节促销活动
        System.out.println("对于中秋节：");
        mSalesMan = new SalesMan("B");
        mSalesMan.SalesManShow();

        //圣诞节来了，使用圣诞节促销活动
        System.out.println("对于圣诞节：");
        mSalesMan = new SalesMan("C");
        mSalesMan.SalesManShow();
    }

}
