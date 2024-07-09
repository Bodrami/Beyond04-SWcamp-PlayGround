/* 01. constructor-function(생성자 함수) */

/* 1. 객체 리터럴 방식 */
const student1 = {
    name: '최원영',
    age: 22,
    getInfo: function() {
        return `${this.name}(은)는 ${this.age}세 입니다.`;
    }
};

const student2 = {
    name: '윤제니',
    age: 18,
    getInfo: function() {
        return `${this.name}(은)는 ${this.age}세 입니다.`;
    }
};

console.log(student1);
console.log(student2);

// 객체 리터럴 방식으로 수백명의 학생 객체를 만들어야 한다.

/* 2. 생성자 함수 방식 */       // 자바의 생성자이자 클래스로 받아들이자
/* 
  객체를 생성하기 위한 프로퍼티들을 하나의 템플릿 개념으로 생성자 함수로써 작성하면
  동일한 프로퍼티를 가지는 여러 객테들을 쉽게 생성해 낼 수 있다.
 */
function Student(name, age) {
    // console.log('생성자 함수 안의 this', this);

    /* 이 생성자 함수를 통해 생성 될 객체사 this 이다. */
    this.name = name;
    this.age = age;
    this.getInfo = function() {
        
        /* 메소드를 호출한 객체가 this 이다. */
        return `${this.name}(은)는 ${this.age}세 입니다.`;
    }
}

const student3 = new Student('이드보라', 18);
const student4 = new Student('방통통', 20);

/* 각 객체의 메소드 호출 */
console.log(student3.getInfo());
console.log(student4.getInfo());

console.log(student3.constructor);