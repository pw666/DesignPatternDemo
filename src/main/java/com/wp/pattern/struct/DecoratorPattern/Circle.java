package com.wp.pattern.struct.DecoratorPattern;

/**
 * 圆形
 *
 * @author pan.wu
 * @date 2019/12/31 16:54
 * @Description
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
