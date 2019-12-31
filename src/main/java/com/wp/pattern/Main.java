package com.wp.pattern;

import com.wp.pattern.behaviour.StrategyPattern.SalesMan;
import com.wp.pattern.struct.DecoratorPattern.*;

/**
 * @author pan.wu
 * @date 2019/12/19 17:15
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("策略模式测试>>>>>>>>");
        StrategyPatternTest();
        System.out.println("装饰器模式测试>>>>>>>>");
        decoratorPattern();
        //...
    }

    public static void decoratorPattern() {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
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
