package com.ohgiraffers.chap1.section01.timecomplexity;

import java.util.Arrays;
import java.util.Collection;

public class Application {

    /* 수업목표. 시간 복잡도를 이해할 수 있다. */
    /* 필기. 알고리즘 실행 시 입력 값이 증가함에 따라 걸리는 시간의 증가도를 나타낸다. */

    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 15, 4, 9, 10, 7};
        System.out.println(getFirst(arr));
        System.out.println(binarySerch(arr, 9));
        System.out.println(Arrays.toString(reverse(arr)));
    }

    /* 설명. 상수 시간 O(1) (불변성) */
    /* 필기. 여기서 상수는 무시된다.(ex. arr[0]이 2번 적혔다고 했을 때, O(2n)가 아니라 2는 상수이기때문에 무시되고 O(n)으로 표현된다.)*/
    private static int getFirst(int[] arr) {
        return arr[0];
    }

    /* 설명. 로그 시간 O(log n) */
    /*  */
    private static int binarySerch(int[] arr, int target) {
      Arrays.sort(arr);

//        int left = 0;
//        int right = arr.length - 1;
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if(arr[mid] < target) {
                left = mid + 1;                  // mid의 포인터의 기준으로 +1, -1 해서 알고리즘을 돌려 시간을 단축할 수 있음
            } else {
                right = mid -1;
            }
        }

        return -1;
    }

    /* 설명. 선형 시간 O(n) */
    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[arr.length - i - 1] = arr[i];
        }
        return reversed;
    }

    /* 설명. 지수 시간 O(n^2) */
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n-2);
    }
}
