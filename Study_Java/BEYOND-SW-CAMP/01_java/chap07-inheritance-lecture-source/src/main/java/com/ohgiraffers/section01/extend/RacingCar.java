package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {

    @Override
    public void run() {
//        super.run();                    // suoer.은 자신의 부모 객체의 주소를 가지고 오는 것
        System.out.println("레이싱 자동착가 신나게 달립니다. 쌔애애앵!");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적따위 울리지 않습니다.");
    }
}
