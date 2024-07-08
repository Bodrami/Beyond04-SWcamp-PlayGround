package com.ohgiraffers.section02.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/* 수업목표. bean으로 객체 관리하는 방법 2 (현업에서 사용할 수도 있으니 개념적으로만 알고 있으면 된다.) */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context
                = new GenericXmlApplicationContext("section02/xmlconfig/spring-context.xml");

        MemberDTO member = (MemberDTO) context.getBean("member");
        System.out.println("member = " + member);
    }
}
