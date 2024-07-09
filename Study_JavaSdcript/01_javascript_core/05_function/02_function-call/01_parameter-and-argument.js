/* 01. parameter-and-argument(매개변수와 인수) */

/* 함수 선언문 */
function sayHello(name) {
    console.log(name);

    /* 모든 인수(전달인자는 암묵적으로 arguments) 객체의 프로퍼티로 보관된다. (일종의 가변인자 개념) */
    console.log('arguments: ', arguments);
    console.log('두번째 인자: ', arguments['1']);

    return `${name} 님 안녕화세요!`;
}

var result = sayHello('신기방귀');
console.log(result);

result = sayHello();
console.log(result);

result = sayHello('이준진', 유광수);
console.log(result);
