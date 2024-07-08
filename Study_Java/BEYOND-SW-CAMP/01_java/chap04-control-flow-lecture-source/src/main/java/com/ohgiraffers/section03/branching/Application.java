package com.ohgiraffers.section03.branching;

public class Application {

    public static void main(String[] args) {

        /* 필기. break문 흐름 확인용 메소드 호출 */
        A_break aClass = new A_break();

        /* 필기. break문을 활용한 별찍기 문제활용 */
        aClass.testSimpleBreakStatement();

        /* 필기. continue문 흐름 확인용 메소드 호출 */
        B_continue bClass = new B_continue();
//        bClass.testSimpleContinueStatement();

    }
}
