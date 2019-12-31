package com.wp.pattern.struct.DecoratorPattern;

/**
 * 方形
 *
 * @author pan.wu
 * @date 2019/12/31 16:53
 * @Description
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
