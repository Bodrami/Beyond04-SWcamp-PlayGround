package com.ohgiraffers.section01.intro;

@FunctionalInterface
public interface Calculator {
    int sumTwoNumber(int num1, int num2);
//    int sumTwoNumber2(int num1, int num2);              // @FunctionalInterface는 추상메소드가 반드시 하나여야 한다. (한개 이상은 에러뜸)
}
