package com.ohgiraffers.section01.object.dto;

import java.util.Objects;

public class BookDTO {

    private int number;
    private String title;
    private String author;
    private int price;

    public BookDTO() {
    }

    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /* 목차 1. toString() 오버라이딩 */
    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    /* 필기. Object에 정의된 toString() */
//    public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }

    /* 목차 2. equals(Object obj) 오버라이딩 */

//    @Override
//    public boolean equals(Object obj) {
//        return this.author.equals(((BookDTO)obj).getAuthor()) && this.price == ((BookDTO)obj).getPrice();
//
////        return false;

    /* 설명. 우리가 BookDTO 타입의 객체가 동등하다라는 것에 대한 기준을 정하기 위해 오버라이딩 */
    // equals 단축키: ait+insert -> equals and hash next -> 어떤 걸 같게 할건지 선택 -> 자동생성
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDTO bookDTO = (BookDTO) o;
        return number == bookDTO.number && price == bookDTO.price && Objects.equals(title, bookDTO.title) && Objects.equals(author, bookDTO.author);
    }

    /* 목차 3. hahsCode() 동등한 관계를 표현해주는 오버라이딩 */
    /* 설명. 우리가 정한 동등 기준을 만족하면 같은 값이 나오도록 오버라이딩 */
    @Override
    public int hashCode() {
        return Objects.hash(number, title, author, price);   // hashcode란? 검색 및 조회 속도향상을 위해 사용
                                                             // (오버라이딩이 불가능 object의 native코드가 있기 때문, 오버라이딩 하려면 단축키 사용)
    }

}

