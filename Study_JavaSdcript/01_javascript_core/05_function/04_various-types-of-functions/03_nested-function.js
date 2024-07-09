/* 03. nested-function(중첩 함수) */

/* 
  함수 내부에 정의된 함수를 중첩함수또는 내부함수라고 한다.
  중첩함수를 포함하는 함수를 외부함수라고 한다.
  일반적으로 중첩함수는 자신을 포함하는 외부함수를 돕는 헬퍼 (helper) 함수의 역할을 한다. (클로저 함수로도 사용가능)
 */

function outer() {
    var outerVal = '외부함수';              // 선언

    function inner() {
        var innerVal = '내부함수';
        console.log(outerVal, innerVal);  // 선언
    }

    inner();        // 실행
};

outer();            // 실행