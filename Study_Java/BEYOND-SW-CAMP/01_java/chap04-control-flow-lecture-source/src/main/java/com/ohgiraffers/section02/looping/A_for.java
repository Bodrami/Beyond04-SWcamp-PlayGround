package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatment() {

        /* 수업목표. for문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.(지역변수) */
        for(int i = 1; i <= 10; i++) {
            //초기식; 조건식; 증감식         초기식으로 선언 -> 조건식을 만족하는지(만족할 때만 실행됨) 조건이 false가 되면 밖으로 빠져나감 ->
            //                           {}가 실행됨 -> 반복을 빠져나가기 위해 증감식을 통해 만족시킴
            //                           -> 증감된 값이 조건을 만족하는지 확인 -> 실행종료
            System.out.println("i = " + i);
        }

        for (int i = 0; i < 20 ; i++) {

        }
    }

    public void testForExample1() {

        /* 수업목표. 무엇을 반복하는지를 확인하여 반목문으로 개선할 수 있다. */
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;

        int sum = 0;

        sum += 2 * num1 + 1;
        sum += 2 * num2 + 1;
        sum += 2 * num3 + 1;
        sum += 2 * num4 + 1;
        sum += 2 * num5 + 1;                   // 처음 경험하는 사람은 이걸 먼저 고려 해보고 for문 작성

        System.out.println("sum = " + sum);

        /* 설명. for문을 통해 개선해보자. */
        int forSum = 0;

//        int num = 0;
//        for(int i = 1; i <= 5; i++) {
//            num = i;
//            forsum += 2 * num + 1;

        for (int i = 1; i < 6; i++) {
            forSum += 2 * i + 1;
                                               // 반복문을 통해 규칙성이 보이는 실행문의 가독성을 높여줌
        }                                      // 반복문을 필요로 하는 경우: 사용자의 입력에 따라 값이 달라진다면 반복문을 사용
        System.out.println("forsum: " + forSum);
    }

    public void testForExample2() {

        /* 수업목표. 입력값을 활용하여 반복문을 써야만 하는 경우를 확인해보자. */
        Scanner sc = new Scanner(System.in);
        System.out.print("초기 정수값 입력: ");
        int init = sc.nextInt();
        System.out.print("상한 정수값 입력: ");
        int limit = sc.nextInt();

        /* 설명. 입력받은 값을 토대로 반복하며 init(초기값)부터 2씩 증가되는 값을 반복 횟수만큼 누적 시키기 */
        int sum = 0;
        for (int i = init; i <= limit; i+= 2) {
            sum += i;
        }

        System.out.println("sum = " + sum);
    }


}
