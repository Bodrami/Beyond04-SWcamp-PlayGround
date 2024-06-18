package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountGenerator() {
        return new PersonalAccount(20, "110-234-2345");
    }

    /* 설명. 메소드에서 반환한 값(Account bean)을 setter 주입 */
    @Bean
    public MemberDTO memberGenerator() {
//        MemberDTO member = new MemberDTO();
//        member.setSequence(1);
//        member.setName("홍길동");
//        member.setPhone("010-3445-9873");
//        member.setEmail("hong234@gmail.com");
//        member.setPersonalAccount(accountGenerator());
//          return member;

        /* 설명. 메소드에서 반환한 값을 생성자 주입 (한줄 코딩 가능) */
    return new MemberDTO(1, "홍길동", "010-1234-5667", "hong123@gmail.com", accountGenerator());
    }
}
