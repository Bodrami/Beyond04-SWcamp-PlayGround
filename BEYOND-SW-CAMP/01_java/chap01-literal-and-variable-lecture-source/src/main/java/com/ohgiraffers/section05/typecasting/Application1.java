package com.ohgiraffers.section05.typecasting;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 자동 형변환(implicit coercion) 규칙에 대해 이해할 수 있다. */

        /* 목차 1. 정수끼리의 자동 형변환 */
        /* 설명. 점점 더 큰 자료형으로 데이터를 옮겨도 문제 없이 자동형변환 되어 대입이 이루어짐 */
        byte bnum = 1;                            // 리터럴이 정수일 때 자바는 int로 받아들이지만
                                                  // int -> byte, int -> short는 자동 형변환됨.
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        /* 설명. 연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 낮은 자료형이 자동형변환 됨 */
        int num1 = 10;
        long num2 = 20L;

        long result1 = num1 + num2;
        System.out.println("result = " + result1);

        /* 설명. 문자형은 int형으로 자동 형변환 됨.(그 반대도 가능) */
        int ch1 = 'a';
        int charNumber = ch1;
        System.out.println("charNumber = " + charNumber);

        char ch2 = 65;
        System.out.println("ch2 = " + ch2);

        /* 목차 2. 실수 끼리의 자동 형변환 */
        float fnum = 4.0f;
        double dnum = fnum;

        /* 연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 계산된다. */
        double result2 = fnum + dnum;

        System.out.println("result2 : " + result2);

        /* 목차 3. 정수는 실수로 자동 형변환된다. */
        /* 정수를 실수로 변경할 때 소수점 자리수가 없어도 실수형태로 표현이 가능하다. 이 때 데이터 손실이 없기 때문에 자동 형변환이 가능하다.
         * 실제 값을 저장하는 매커니즘을 가진 것과 달리 실수형은 지수부와 가수부를 따로 나눠서 작성하기 때문에
         * 바이트 크기 보다 훨씬 더 많은 값을 표현할 수 있다.
         * */
        //long eight = 888888888888888888888;					//이것도 지동으로 형변환 된 것이다. (int 범위 벗어나면 에러 발생)
        long eight = 8;
        float four = eight;

        System.out.println("four : " + four);

        /* 따라서 실수와 정수의 연산은 실수로 연산 결과가 반환된다. */
        float result3 = eight + four;

        System.out.println("result3 : " + result3);

        //long eight = 888888888888888888888;					// 이것도 지동으로 형변환 된 것이다. (int 범위 벗어나면 에러 발생)
//        long eight = 8;
//        float four = eight;
//
//        System.out.println("four : " + four);
//
//        /* 따라서 실수와 정수의 연산은 실수로 연산 결과가 반환된다. */
//        float result3 = eight + four;
//
//        System.out.println("result3 : " + result3);

        /* 목차 4. 논리형은 형변환 규칙에서 제외된다. */
        /* 어느 자료형이든 boolean을 형변환 해서 담을 수 없다. */
        boolean isTrue = true;
        //byte b = isTrue;
        //short s = isTrue;
        //int i = isTrue;
        //long l = isTrue;
        //char c = isTrue;
        //float f = isTrue;
        //double d = isTrue;

    }
}
