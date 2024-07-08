package com.ohgiraffers.section02.userexception;


public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 사용자 정의의 예외클래스 정의 후 발생한 사용자 정의의 예외를 처리할 수 있다.
         *          예외 상황이 주어진 곳에 try-catch로 감싸준다.*/
        ExceptionTest1 et = new ExceptionTest1();

        try {
//                et.checkEnoughMoney(-30000, 50000);
//                et.checkEnoughMoney(30000, -50000);
                et.checkEnoughMoney(50000, 30000);
            }
//            catch (PriceNegativeException e) {                       // 예외 타입에는 부모 클래스(Exception)가 먼저 오면 안됨
//                System.out.println(e.getMessage());
//            } catch (NotEnoughMoneyException e) {
//                System.out.println(e.getMessage());
//            } catch (MoneyNegativeException e) {
//                System.out.println(e.getMessage());
            catch (Exception e) {                                      // 다형성을 활용한 catch 처리 방식
            System.out.println("예외 메시지: " + e.getMessage());


        }

    }
}
