package com.ohgiraffers.section01.exception;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws Exception {
        System.out.println("가지고 계신 돈은 " + money + "원 입니다.");

        if (money >= price) {
            System.out.println(price + "원 상품을 구입하기 위한 금액이 충분합니다.");
        } else {                                               // 예외 상황일 경우 JVM이 예외상황을 알려준다.
             throw new Exception("호주머니 사정이 딱하시군요!");   // 예외 상황의 객체를 만든 이유는 후처리를 도움
        }                                                      // 에외 상황을 해당 메소드에 던져 throws Exception를 만듬
    }                                                          // 메인 메소드에도 에러가 뜨는데 그 경우에도 메소드에 예외상황을 던져 throws Exception를 만듬
}
