package com.ohgiraffers.section03.primarykey.subsection01.identity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

import java.util.List;


public class PrimaryKeyMappingTests {

    private static EntityManagerFactory entityManagerFactory;

    private EntityManager entityManager;

    @BeforeAll
    public static void initFactory() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");
    }

    @BeforeEach
    public void  initManager() {
        entityManager = entityManagerFactory.createEntityManager();
    }

    @AfterAll
    public static void closeFactory() {
        entityManagerFactory.close();
    }

    @AfterEach
    public void closeManager() {
        entityManager.close();      // 매니저가 닫히면 내부적으로 flush()가 날아가서 DB에 영향을 줌
    }

    /* 설명. strategy: 자동 생성 전략을 지정
    *       - GenerationType.IDENTITY: 기본 키 생성을 데이터 베이스에 위임(MySQL 또는 MariaDB의 auto_increment)
    *       - GenerationType.SEQUENCE: 데이터 베이스 시퀀스 객체 사용(ORACLE의 SEQUENCE)
    *       - GenerationType.TABLE: 키 생성 테이블 사용
    *       - GenerationType.AUTO: 자동 선택(MySQL의 IDENTITY 또는 ORACLE이면 SEQUENCE)
    * */

    @Test
    public void 식별자_매핑_테스트() {

        Member member = new Member();
//        member.setMemberNo(1);
        member.setMemberId("user01");
        member.setMemberPwd("pass01");
        member.setNickName("홍길동");
        member.setPhone("010-3455-4567");
        member.setEmail("dlwldms1234@naver.com");
        member.setAddress("서울시 관악구");
        member.setEnrollDate(new java.util.Date());
        member.setMemberRole("ROLE_MEMBER");
        member.setStatus("Y");

        Member member2 = new Member();
//        member2.setMemberNo(1);
        member2.setMemberId("user02");
        member2.setMemberPwd("pass02");
        member2.setNickName("유관순");
        member2.setPhone("010-3048-4127");
        member2.setEmail("dlwl124@naver.com");
        member2.setAddress("서울시 동작구");
        member2.setEnrollDate(new java.util.Date());
        member2.setMemberRole("ROLE_MEMBER");
        member2.setStatus("Y");

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(member);
        entityManager.persist(member2);
        entityTransaction.commit();

//        Member selectedMember = entityManager.find(Member.class, 1);
//        System.out.println("selectedMember = " + selectedMember);

        // 맨 뒤에 붙은 A는 별칭인데 달지 않으면 조회가 되지 않아 꼭 달아주도록 한다.
        String jpql = "SELECT A.memberNo FROM member_section03_subsection01 A";

        List<Integer> memberNoList = entityManager.createQuery(jpql, Integer.class).getResultList();

        memberNoList.forEach(System.out::println);
    }
 }
