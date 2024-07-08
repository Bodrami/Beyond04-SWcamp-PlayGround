package com.ohgiraffers.section02.pakage_and_import;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 패키지에 대해 이해할 수 있다. */

        /* 목차 1. non-static 메소드 호출 */
        com.ohgiraffers.section01.method.Calculator cal
                = new com.ohgiraffers.section01.method.Calculator();

        System.out.println("100과 20의 합: " + plusResult);
        int plusResult = cal.plusTwoNumbers(100, 20);

        /* 목차 2. static메소드 호출 */
        int maxResult
                = com.ohgiraffers.section01.method.Calculator.maxNumbersOf(100, 20);
        System.out.println("두 수 중 큰 값: " + maxResult);
    }
}
