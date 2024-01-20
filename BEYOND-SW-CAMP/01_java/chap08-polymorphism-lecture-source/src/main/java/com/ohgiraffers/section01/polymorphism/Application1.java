package com.ohgiraffers.section01.polymorphism;

public class Application1 {


    public static void main(String[] args) {

        /* 수업목표. 다형성과 타입 형변환에 대해 이해 할 수 있다. */
        Animal animal = new Animal();              // 여기서 형변환은 부모에서 자식으로 자동 형변환이 되는 것
        animal.eat();
        animal.run();
        animal.cry();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        /* 설명. 다형성 적용(부모 타입으로 자식 인스턴스의 주소값 저장) */
        Animal an1 = new Tiger();           // 다형성 적용 O
        Animal an2 = new Rabbit();          // 다형성 적용 O
        Animal an3 = new Animal();          // 다형성 적용 X

        /* 설명. Animal은 Tiger나 Rabbit이 아니다. (Animal은 Tiger나 Rabbit 타입을 지니고 있지 않다.) */
//        Tiger tiger1 = new Animal();
//        Rabbit rabbit1 = new Animal();    // 에러 발생

        /* 설명. 동적바인딩 확인하기
         *  필기. 컴파일 당시에는 해당 타입의 메소드와 연결되어 있다가,
         *        런타임 당시 실제 객체가 가진 오버라이딩 괸 메소드로 바인딩이 바뀌어 동작하는 것을 의미한다.
         *        (동적 바인딩의 조건: 1. 상속, 2. 오버라이딩)
        *  */

        System.out.println("동적 바인딩 확인 ==========================");
//        an1.;                               // 정적 바인딩되었음 (an1.은 정적바인딩 상태에서 Animal인줄 알고 있음)
         an1.cry();                           // 런타임 시점에 부모타입에서 정적바인딩 된 것을 자식 클래스에서 오버라인딩된 것을
         an2.cry();                           // 찾는 것이 동적 바인딩 (동적바인딩 조건: 상속, 오버라이딩)
         an3.cry();

        /* 설명. 오버라이딩 되지 않은(추가한 메소드) 메소드 호출은 다운캐스팅을 해 주어야 한다. */
        /* 필기. instance 란?
        *        해당 객체의 타입을 런타임 시점에 확인하기 위한 연산자 */
        if (an1 instanceof Tiger) {     // an1은 Tiger 타입의 인스턴스인가
        ((Tiger)an1).bite();
        }                               // 다운 캐스팅 표기법: (Tiger)an1).bite();

        if (an1 instanceof Rabbit) {
            ((Rabbit)an1).jump();
        }                               // 표기법을 두번 사용하면 에러가 실행할 때 발생됨(경고), 하지만 if문을 사용하여 적용해주면
                                        // 에러 없이 작동될 수 있음.

        /* 설명. 다형성은 상속관계의 객체들간에 형변환 */
        Animal animal2 = new Tiger();   // 자동 형변환(auto up-casting), 다형성 O, (= 묵시적 형변환)
        Rabbit rabbit2 = (Rabbit)an2;   // 강제 형변환(down-casting), 다형성이 X,(= 명시적 형변환)
    }
}
