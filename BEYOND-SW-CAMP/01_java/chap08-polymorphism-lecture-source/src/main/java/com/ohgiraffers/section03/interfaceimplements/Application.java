package com.ohgiraffers.section03.interfaceimplements;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 인터페이스(interface)에 대해 이해할 수 있다. */
        /* 필기. 인터페이스란?
         *      자바의 클래스와 유사한 형태지만 추상메소드(public abstract, 규약)와 상수 필드(public static final)만 가질 수 있는 클래스의 변형체 이다.
         *      (프로그램의 전체적인 설정과 만들어야할 규약의 집합체, 결국 유지보수가 좋기 때문에)
        * */

        /* 설명. 추상클래스와 인터페이스의 차이는 면접 단골질문이니 잘알고 정리하자. */
//        InterProduct ip1 = new InterProduct();                  // 생성자가 없는 인터페이스는 객체 생성 X
        InterProduct ip2 = new Product();                         // 다만, 타입으로 활용이 가능하다.(다형성 가능)(타입은닉)
    }
}

       /* 필기.  정보은닉 (유지보수)
        *       - 필드, 메소드은닉(캡슐화): 필드에 대한 정보를 숨긴다. 왜냐면 숨겨야 숨겨진 놈의 수정이 있어도 다른 상속된 클래스에 영향을 받지 않기 때문
        *       - 타입은닉(다형성): 자료형을 숨겨준다?
        *       - 구현은닉(다형서, 오버라이딩)
       * */
