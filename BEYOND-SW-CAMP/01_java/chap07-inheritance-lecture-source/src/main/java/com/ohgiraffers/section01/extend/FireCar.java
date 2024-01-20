package com.ohgiraffers.section01.extend;

public class FireCar extends Car {

    public FireCar() {
        super();
        System.out.println("FireCar 클래스의 기본 생성자 호출됨...");
    }                          // 자식 클래스는 부모의 생성자를 물려받지 않는다는 증거이고
                               // super();는 부모의 기본 생성자를 의미하며 자바에서 자동으로 생성되는데 우리 눈엔 안보임
                               // 자식 클래스는 부모 클래스의 object를 가지고 있음
    /* 필기. @Override 어노테이션을 추가하는 이유?
    *      1. 메소드 중에 부모로부터 물려받은 메소드인 것을 한눈에 알아보기 쉽게 하기 위해서 (가독성 측면)
    *      2. 부모의 메소드를 오버라이딩할 때 발생할 수 있는 실수를 방지하기 위해서 (실수방지 측면)
   * */
    @Override
    public void soundHorn() {
            System.out.println("빠아아아아아아앙ㅇ아아앙아앙! 빵!");
        }                      // 자식 클래스에서 부모 클래스의 정의를 재정의 해준 것

    public void sprayWater() {
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다. 뿌우우우============= .3. ");
    }
    }

