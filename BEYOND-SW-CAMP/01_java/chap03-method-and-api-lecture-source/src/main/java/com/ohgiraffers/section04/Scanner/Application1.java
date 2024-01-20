package com.ohgiraffers.section04.Scanner;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표 . java.util.Scanner를 이용한 다양한 자료형 값 입력 받기*/
//        java.util.Scanner sc = new java.util.Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        /* 목차 1. 문자열 입력받기 */
        System.out.print("이름을 입력하세요: ");
        String name1 = sc.next();                   // 공백이나 개행 전까지 문자열 반환 (버퍼에 나머지 문자 남아있음.)
        String name2 = sc.nextLine();               // 공백이나 개행을 포함한 한 줄의 문자열 모두 반환
        System.out.println("성: " + name1);
        System.out.println("이름: " + name2);

        /* 목차 2. 정수형 입력빋기 */
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는: " + age);

        /* 목차 3. 실수형 입력빋기 */
        System.out.print("키를 입력하세요: ");
        double height = sc.nextDouble();
        System.out.println("입력하신 키는: " + height);

        /* 목차 4. 논리형 입력빋기 */
        System.out.print("참과 거짓 중에 한 가지를 true 또는 false로 입력하세요: ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리 값은: " + isTrue + "입니다.");

//        sc.nextLine();    // 밑에서 nextLine을 쓰고 싶다면 중간에 버퍼에 남은 공백 및 개행 제거용 nextLine();

        /* 목차 5. 문자형 입력빋기 */
        System.out.print("아무 문자나 입력해주세요: ");
//        char answer = sc.nextLine().charAt(0);                  // 컴파일 에러가 난 이유는 nextLine()은 버퍼에 있는 문자까지 가져와 지기 때문에(?)
        char answer = sc.next().charAt(0);    // (0)은 인덱스 번호 인데 (이드보라)일 경우 '이'만 반환된다. 메소드 체이님 방식으로 사용자의 입력 값에서 인덱스 번째의 문자를 char형으로 반환
        System.out.println("입력하신 문자는: " + answer + "입니다.");

    }
}
