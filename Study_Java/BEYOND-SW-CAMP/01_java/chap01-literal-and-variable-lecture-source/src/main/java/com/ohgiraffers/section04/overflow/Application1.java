package com.ohgiraffers.section04.overflow;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표. 오버플로우에 대해 이해할 수 있다. */

        /* 필기. 자료형 별 값의 최대 범위를 벗어나는 경우
            발생한 carry를 버림처리 하고 sign bit를 반전시켜 최소값으로 순환시킴
        * */

        /* 목차 1. 오버플로우 */
        byte num1 = 126;                           // byte 자료형의 양의 최대 저장 범위 값

        num1++;                                   // num1 = num1 + 1 은 의미상 같다.
        System.out.println("num1 = " + num1);

        num1++;
        System.out.println("num1 = " + num1);

        num1++;
        System.out.println("num1 = " + num1);

        /* 목차 2. 언더플로우 */
        byte num2 = -127;                         // byte 최소 저장 범위

        num2--;                                   // num2-- = num2 -1 은 의미상 같다.
        System.out.println("num2 = " + num2);

        num2--;
        System.out.println("num2 = " + num2);

        num2--;
        System.out.println("num2 = " + num2);

        /* 목차 3. 논리적 문제 발생 및 해결방안 */

        /* 설명.
        *   일반적으로 많이 사용하는 int형의 최대값은 대략 21억 정도이다.
        *   이 범위를 벗어난 계산은 오버플로우를 발생시켜 원하지 않는 결과값이 나오게 될 수 있다. */
//        int firstNum = 1000000;                    // 100만
//        int secondNum = 700000;                    // 70만
//
//        int multi = firstNum * secondNum;          // 7천억이 나와야함
//        int multi2 = 1000000 * 700000;
//
//        System.out.println("firstNum * secondNum: " + multi);

        /* 설명. 오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리한다. */
//        long longMulti = firstNum * secondNum;
//
//        System.out.println("longMulti : " + longMulti);		//여전히 오버플로우가 발생

        /* 설명. 이미 오버플로우 처리 된 결과를 가지고 변수에 담기 때문에 위에 결과랑 별 차이가 없음
         * 그럼 어떻게 해결을 해야 하나?
         * 계산이 처리 되기 전에 long 타입으로 자료형을 변경해주어야 함함 (강제형변환 이용)
         * */
        long firstNum = 1000000;                   
        long secondNum = 700000;

        long result = (long) firstNum * secondNum;
        System.out.println("result : " + result);			//정상적으로 7천억이 출력될 것
    }
}
