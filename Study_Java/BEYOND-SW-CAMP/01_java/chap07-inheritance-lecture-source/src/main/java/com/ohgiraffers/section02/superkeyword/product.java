package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class product {
    private String code;    // 상품코드
    private String brand;   // 제조사
    private String name;    // 상품명
    private int price;      // 가격
    private java.util.Date menufacturingDate;   // 제조일자

    public product() {
        System.out.println("computer 클래스의 기본 생성자 호출함...");
    }

    public product(String code, String brand, String name, int price, Date menufacturingDate) {
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.menufacturingDate = menufacturingDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getMenufacturingDate() {
        return menufacturingDate;
    }

    public void setMenufacturingDate(Date menufacturingDate) {
        this.menufacturingDate = menufacturingDate;
    }

    @Override
    public String toString() {
        return "product{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", menufacturingDate=" + menufacturingDate +
                '}';
    }
}
