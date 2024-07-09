package com.ohgiraffers.springdatajpa;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Chap05SpringDataJpaLectureSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap05SpringDataJpaLectureSourceApplication.class, args);
    }

    @Bean       // 객체 생성을 빈으로 관리할 수 있도록 지정
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
