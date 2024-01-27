package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application5 {

    public static void main(String[] args) {

        /* 수업목표. Queue에 대해 이해하고 사용할 수 있다. */
        /* 필기. Queue란?
         *       선형 메모리 공간에 데이터를 저장하여 순서를 유지하기 위한 선입선출 방식의 자료구조이다.
         *       대부분 LinkedList를 많이 사용한다.  offer(값 넣기), poll(값 빼기)
        * */

//        Queue<String> que = Queue();                      // 에러남
//        Queue<String> que = new LinkedList<>();           // que 우선수위 대로 값이 들어가 있음
        PriorityQueue<String> que = new PriorityQueue<>();  // que이면서 정렬을 위한 최우선 가치의 있는 요소의 순서를 최앞단으로 바꿔주는 기능이 있는 자료구조 오름차순의 코드
                                                            // (값을 빼면 우선순위 되는 값이 앞으로 가고 값들이 계속 변경된다.)

        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);

        System.out.println("peek(): " + que.peek());
        System.out.println("peek(): " + que.peek());

        System.out.println("poll(): " + que.poll());
        System.out.println("poll(): " + que.poll());
        System.out.println("poll(): " + que.poll());
        System.out.println("poll(): " + que.poll());
        System.out.println("poll(): " + que.poll());
        System.out.println("que = " + que);
    }
}
