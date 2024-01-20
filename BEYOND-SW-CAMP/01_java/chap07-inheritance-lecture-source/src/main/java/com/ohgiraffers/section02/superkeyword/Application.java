package com.ohgiraffers.section02.superkeyword;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. super.과 super()에 대해 이해할 수 있다. */
        /* 필기. super.: 자식 클래스 타입의 객체가 생성될 때 먼저 생성된 부모 클래스 타입의 객체의 주소값(참조값)을 통해 접근
         *      super(): 부모로부터 물려받지 못한 생성자를 부모 클래스에 있는 생성자를 활용하기 위해 사용
         *      이 두가지는 안보일 경우가 있는데 그것은 JVM이 자동으로 판별하여 적어주기 때문에 안보임.(써줘도 문제되진 않음)
        *  */

        product product1 = new product();
        System.out.println(product1)
        ;

        product product2 = new product("p01" , "playdata" , "java", 1000 , new java.util.Date());
        System.out.println(product2);

        computer computer1 =new computer();
        System.out.println(computer1);             // 자식 클래스의 toString()을 작성하지 않으면 부모로부터 물려받은 toString() 결과가 나온다.

        computer computer2 = new computer("퀄컴 스냄드래곤", 512, 16, "안드로이드");
        System.out.println(computer2);

        computer computer3 = new computer("S-01234", "구글", "픽셀", 1000000, new java.util.Date(),
                "퀄컴 스냄드래곤", 512, 16, "안드로이드");
        System.out.println(computer3);
    }
}
