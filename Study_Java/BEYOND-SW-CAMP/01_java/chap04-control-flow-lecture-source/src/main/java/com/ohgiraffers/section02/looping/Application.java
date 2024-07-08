package com.ohgiraffers.section02.looping;

public class Application {

    public static <C_While> void main(String[] args) {

        A_for aClass = new A_for();
//
//        /* 필기. 단독 for문 흐름 확인용 메소드 호출 */
//        aClass.testSimpleForStatment();
//
//        /* 필기. 반복문을 사용하는 예제 (반복문의 필요성)*/
        aClass.testForExample1();
//        aClass.testForExample2();

          /* 필기. 중첩 반복문을 사용하는 예제 */
          B_nestedFor bClass = new B_nestedFor();
//         bClass.printGugudanFromToNine();
//         bClass.printUpgradeGugudanFromTwoToNine();

        /* 필기. 중첩 반복문을 활용한 별찍기 관련 예제 */
//        bClass.printStars();

        /* 필기. 단독 While문 흐름 확인용 메소드 호출 */
//        C_While cClass = new C_While();
//        cClass.testSimpleWhileStatement();
//
//        cClass.testwhileExample();
//
//        /* 필기. While문 사용하는 예제 */
//        cClass.testwhileExample(); 
        
        /* 필기. do-while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        D_dowhile dClass = new D_dowhile();
        dClass.testSimpleDoWhileStatement();
        
        /* 필기. do-while문 사용하는 예제 */
        dClass.testDoWhileExample();
    }  
}
