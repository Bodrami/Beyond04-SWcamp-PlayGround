package com.ohgiraffers.section02.pakage_and_import;

import com.ohgiraffers.section01.method.Calculator;      // 다른 클래스에서 불러오는 게 아니고, com.ohgiraffers.section01.method.를
                                                         // 생략하기 위해서 import로 별칭으로 다는 것이다.
public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. import에 대해 이해할 수 있다. */
        Calculator cal = new Calculator();               // import를 활용해 줄여쓴 Calculator
        int sub = cal.subTwoNumbers(80, 21);
        System.out.println("80 - 21 = " + sub);
    }
}
