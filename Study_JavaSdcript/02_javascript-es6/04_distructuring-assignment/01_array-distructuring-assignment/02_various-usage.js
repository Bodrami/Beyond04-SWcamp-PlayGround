/* 02. various-usage(다양한 사용법) */

/* 객체의 프로퍼티에도 한번에 구조 분해 할당 후 추가할 수 있다. */
let user = {};
[user.firstName, user.lastName] = "BoRa Lee".split(" ");

console.log(user);

/* 일치하지 않는 나머지(rest) 요소를 한번에 가져오기 */
let [sign1, sign2, ...rest] = ['앞자리', '옆자리', '뒷자리', '돗자리', '잠자리'];

console.log(sign1);
console.log(sign2);
console.log(rest);

/* 변수 교환 용도로도 사용할 수 있다. */
let student = '채영아';
let teacher = '양경민';

[student, teacher] = [teacher, student];

console.log(`학생: ${student}, 교사: ${teacher}`);

/* 기본 값을 설정하고 사용할 수도 있다. */
let [firstName4 = "이보라", lastName4 = "이"] = ["뽀라"];

console.log(firstName4);
console.log(lastName4);