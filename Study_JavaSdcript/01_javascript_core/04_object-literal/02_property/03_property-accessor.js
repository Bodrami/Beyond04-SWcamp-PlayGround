/* 03. property-accessor(프로퍼티 접근) */

var dog = {
    name: '뽀삐리',
    eat: function(food) {
        console.log(`${this.name}은(는) ${food}를 맛있게 먹어요.`);         // 메소드에서의 'this'는 메소드를 호출한 객체 (여기서 this는 dog가 된다)  
    }
};

/* 1. 마침표 표기법 (dot notation) */
console.log(dog.name);
dog.eat('고소한 감쟈');

/* 2. 대괄호 표기법 (square braket notation) */
console.log(dog['name']);
dog['eat']('단짠 허니버터칩');

/* 대괄호 표기법만 가능한 경우 */
var obj = {
    'dash-key': 'dash-value',
    0: 1
}

/* 프로퍼티 키가 식별자 네이밍 규칙을 준수하지 않는 이름일 경우 반드시 대괄호 표기법을 사용한다. (홀따옴표 필수!) */
// console.log(obj.dash-key);          // 자바 스크립트에서는 '_, $' 만 인식이 되기 때문에 -나 다른 기호가 들어가는 경우에는 대괄호 표기법만 가능하다.
// console.log(obj.'dash-key');
// console.log(obj[dash-key]);
console.log(obj['dash-key']);

/* 프로퍼티 키가 숫자로 이루어진 경우 홀따옴표를 생략한 대괄호 표기법도 가능하지만 가능하면 홀따옴표를 붙이자! */
// console.log(obj.0);
// console.log(obj.'0');
console.log(obj[0]);
console.log(obj['0']);