package com.wp.pattern.struct.DecoratorPattern;

/**
 * Shape 接口的抽象装饰类
 *
 * @author pan.wu
 * @date 2019/12/31 16:55
 * @Description
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
