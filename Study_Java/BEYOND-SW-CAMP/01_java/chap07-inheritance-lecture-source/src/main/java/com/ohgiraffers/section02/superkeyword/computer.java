package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class computer extends product {
    private String cpu;               // 연산장치
    private int hdd;                  // 하드웨어
    private int ram;                  // 램
    private String operationSystem;   // 운영체제

    public computer() {
        super();
        System.out.println("computer 클래스의 기본 생성자 호출함...");
    }

    public computer(String cpu, int hdd, int ram, String operationSystem) {
        super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;              // 자식 클래스 초기화
        System.out.println("computer 클래스의 모든 필드를 초기화하는 생성자 호출함");
    }

    public computer(String code, String brand, String name, int price, Date menufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, menufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;              // 부모 클래스 초기화
        System.out.println("computer 클래스의 부모 필드까지 모두 초기화하는 생성자 호출함...");
    }

    @Override
    public String toString() {
//        return "computer{" +
//                "cpu='" + cpu + '\'' +
//                ", hdd=" + hdd +
//                ", ram=" + ram +
//                ", operationSystem='" + operationSystem + '\'' +
//                "} " + super.toString();                      // toString() 생성시 'String concat (+) and super.toString()'으로 생성해야함

        return "computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operationSystem='" + operationSystem + '\'' +
                "} " + "product{" +
                "code='" + super.getCode() + '\'' +
                ", brand='" + super.getBrand() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                ", menufacturingDate=" + this.getMenufacturingDate() +
                '}';                                            // 위 코드와 동일하고 위 코드의 super.toString(); 부분이 부모테이블 product의
                                                                // 정의된 것을 줄여준 것임
    }
}
