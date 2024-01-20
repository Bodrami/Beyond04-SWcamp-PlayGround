package com.ohgiraffers.section03.branching;

public class B_continue {
    public void testSimpleContinueStatement() {

        /* 수업목표. continue문 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기. continue문 또한 반복문 안에서 사용한다. continue구문 이후 반복할 내용을 건너뛰고 다음스텝으로 넘어간다. */

        /* 설명. 1부터 100사이의 4의 배수이면서 5의 배수인 값 출력(4와 5의 공배수) */
        for (int i = 1; i <= 100; i++) {

//            if (4와 5의 공배수가 아니면)
//                 아래출력을 건너뛴다.
            if(!(i % 4 == 0 && i % 5 == 0)) continue;           // 조건문 또는 반복문의 실행구문이 1개일 경우에 {}는 생략가능
                                                                // 반복을 멈추는 것이 아니고 다음 스텝으로 넘어가는 것이 continue
                                                                // break는 반복을 멈추어주는 것
            System.out.println("i = " + i);

        }
    }
}
