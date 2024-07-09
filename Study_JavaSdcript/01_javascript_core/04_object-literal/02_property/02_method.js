/* 02. method */
/* 자바 스크립트의 함수는 객체이다. 함수는 값으로 취급할 수 있고 프로퍼티 값으로 사용할 수도 있다. */

var name = '보더콜리';

var dog = {
    name: '뽀삐리',
    eat: function(food) {
        console.log(`${name}은(는) ${food}를 맛있게 먹어요.`);              // this를 안 붙이고 그냥 ${name}이면 지역변수를 생성해주어 실행해야한다. (this.이 없으면 전역변수 이다)
        console.log(`${this.name}은(는) ${food}를 맛있게 먹어요.`);         // 메소드에서의 'this'는 메소드를 호출한 객체 (여기서 this는 dog가 된다)  
        
        return '잘 먹었네~~!!';
    }
};

console.log(dog.eat('달디단 고구마'));