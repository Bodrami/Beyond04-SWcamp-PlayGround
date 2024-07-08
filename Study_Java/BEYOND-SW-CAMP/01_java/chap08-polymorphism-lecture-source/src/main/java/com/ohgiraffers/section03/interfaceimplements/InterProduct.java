package com.ohgiraffers.section03.interfaceimplements;

/* 설명. 인터페이스 간에는 다중상속이 가능하고 implements 대신 extends를 사용한다. */
public interface InterProduct extends ParentInterProduct, AnotherParentInterProduct {
                                               // 인터페이스는 위 처럼 다중상속이 가능하다
//    private String name;
//    public String name;
//    public static String name;               // 인터페이스의 조건 성립 안됨

//    public static final int Max_NUM = 100;   // 상수명 표기법

    /* 설명. 상수 필드만 가질 수 있기 때문에 모든 필드는 묵시적으로 public static final이다. */
    int MAX_NUM = 100;
                                               // 상품 최대 100개만 저장 가능하고 이 값을 활용해 조건식을 작성해라. (요구사항의 프로젝트 설정값)

    /* 설명. 인터페이스는 생성자를 가질 수 없다. */
//    public InterProduct() {}

    /* 설명. 추상메소드만 작성이 가능하다.(public abstract) */
//    private void nonStaticMethod();
//    public abstract void nonStaticMethod();

    void nonStaticMethod();                    // 인터페이스 표기법

    /* 설명. 하지만 static 메소드는 바디부까지 작성을 허용하였다. (JDK 1.8부터 추가된 기능)*/
    public static void staticMethod() {
        System.out.println("InterProduct 클래스의 staticMethod 호출됨...");
    }

    /*  설명. 또한 default 키워드를 사용하면 non-static 메소드로 작성 가능하다. (JDK 1.8부터 추가된 기능) */
    public default void defaultMethod() {
        System.out.println("InterProduct 클래스의 defalutMethod 호출됨...");
    }

    /* 설명. private도 abstract가 아닌 온전한 메소드로 사용은 가능하다. (default도 없이) */
    private void privateMethod() {

    /* 설명. 다른 public default 메소드에서 활용할 수만 있는 메소드 */

    }
}
