package com.wp.pattern.struct.DecoratorPattern;

/**
 * ShapeDecorator 类的实体装饰类
 *
 * @author pan.wu
 * @date 2019/12/31 16:56
 * @Description
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
