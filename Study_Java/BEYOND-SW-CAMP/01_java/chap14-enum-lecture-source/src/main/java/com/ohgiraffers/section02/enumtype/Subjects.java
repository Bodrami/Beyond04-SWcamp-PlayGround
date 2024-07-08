package com.ohgiraffers.section02.enumtype;

public enum Subjects {
    JAVA,                 // 0
    MARIADB,              // 1
    JDBC,                 // 2
    HTML,                 // 3
    CSS,                  // 4
    JAVASCRIPT;            // 5 (필드 끝에는 꼭 ; 붙이기)

    // 위 필드는 열거형으로 이름과 순서에 해당되는 인덱스가 함께 들어있다.
    // 필드 개수만큼 객체를 생성할 수 있는데 배열처럼 다가가보서 이해해보자


    Subjects() {
        System.out.println("기본 생성자 호출");
    }

    @Override
    public String toString() {
        return "@@@" + this.name() + "@@@";
    }
}
