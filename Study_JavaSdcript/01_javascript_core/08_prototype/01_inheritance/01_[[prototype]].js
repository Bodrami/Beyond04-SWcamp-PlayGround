/* 01. [[prototype]] (프로토타입 객체) */
/* 모든 객체는 프로토타입 객체에 접근할 수 있다. */

const user = {
    activate: true,
    login: function() {
        console.log('로그인이 되었습니다.');
    }
};

console.log(user.__proto__.constructor === Object);   // true
console.log(user.__proto__ === Object.prototype);     // true

const user2 = {
    activate: false,
    login: function() {
        console.log('로그인에 실패 되었습니다.');
    }
}
console.log(user2.__proto__);     // true

const student = {
    passion: true
};

console.log(student.__proto__);   // false

student.__proto__ = user2;        // 부모 객체를 자신의 [[prototype]]에 담으면 상속의 개념이 된다.

student.login();

/* 프로토타입 체인 */
const greedyStudent = {
    class: 1502,
    __proto__: student
}
console.log(greedyStudent.activate);        // user2에서 상속
console.log(greedyStudent.passion);         // studebt에서 상속