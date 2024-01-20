package com.ohgiraffers.section02.abstractclass;

public abstract class Product {
    private int nonStaticField;
    private static int staticField;

    public Product() {}

    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod 호출함...");
    }
    public void staticMethod() {
        System.out.println("Product 클래스의 staticMethod 호출함...");
    }
    public abstract void abstractMethod();      // 오버라이딩 반드시 해야함. 자식 클래스의 경우 강한 강제적 규약으로 지켜야함

}
