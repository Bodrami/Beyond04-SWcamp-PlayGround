/* 01. array-method(배열 메소드) */

const foodList = ['물회', '군계폐계닭', '활어회', '샤인머스켓', '초콜릿'];

/* indexOf */
console.log(`foodList.indexOf('물회'): ${foodList.indexOf('물회')}`);   // 0
console.log(`foodList.indexOf('김밥'): ${foodList.indexOf('김밥')}`);   // -1 (리스트에 없는 경우)

/* incluses */
console.log(`foodList.includes('물회'): ${foodList.includes('물회')}`);   // true
console.log(`foodList.includes('떡볶이'): ${foodList.includes('떡볶이')}`);   // false

const chinessFood = ['자장면', '깐쇼새우', '탕수육'];

/* push */
chinessFood.push('짬뽕');
chinessFood.push('양장피');

console.log(`push 후: ${chinessFood}`);  // push 후: 자장면,깐쇼새우,탕수육,짬뽕,양장피

/* pop */
// chinessFood.pop();

console.log(`chinessFood.pop(): ${chinessFood.pop()}`);   // chinessFood.pop(): 짬뽕
console.log(`pop 후: ${chinessFood}`);   // pop 후: 자장면,깐쇼새우,탕수육,짬뽕

const chickenList = ['뿌링클', '황금올리브', '처갓집 양념치킨'];

/* unshift */
console.log(`chickenList.unshift(): ${chickenList.unshift('후라이드')}`);       // chickenList.unshift(): 4
console.log(`chickenList.unshift(): ${chickenList.unshift('간장치킨')}`);       // chickenList.unshift(): 5

console.log(`unshift 후: ${chickenList}`);   // unshift 후: 간장치킨,후라이드,뿌링클,황금올리브,처갓집 양념치킨

/* shift */
console.log(`chickenList.shift(): ${chickenList.shift()}`);   // chickenList.shift(): 간장치킨

console.log(`shift 후: ${chickenList}`);   // shift 후: 후라이드,뿌링클,황금올리브,처갓집 양념치킨

/* concat: 두 개 이상의 배열을 결합하여 새로운 배열을 반환 (결합 순서의 유의미) */
const idol1 = ['스트레이 키즈', '오마이걸'];
const idol2 = ['블핑', '빅뱅'];
const idol3 = ['여자 아이들', '세븐틴'];

console.log(`idol1 기준으로 idol2 배열을 concat: ${idol1.concat(idol2)}`);    // idol1 기준으로 idol2 배열을 concat: 스트레이 키즈,오마이걸,블핑,빅뱅
console.log(`idol1 기준으로 idol2 배열을 concat: ${[...idol1, ...idol2]}`);   // idol1 기준으로 idol2 배열을 concat: 스트레이 키즈,오마이걸,블핑,빅뱅
console.log(`idol3 기준으로 idol1, idol2 배열을 concat: ${idol3.concat(idol1, idol2)}`);    // idol3 기준으로 idol1, idol2 배열을 concat: 여자 아이들,세븐틴,스트레이 키즈,오마이걸,블핑,빅뱅

/* slice: 배열의 요소 선택 복사하기 */
/* splice: 배열의 index 위치의 요소 제거 및 추가 */
const front = ['HTML', 'CSS', 'JavaScript', 'Vue'];

console.log(`front.slice(): ${front.slice(0, 3)}`);  // front.slice(): CSS,JavaScript
console.log(`front: ${front}`);                      // ront: HTML,CSS,JavaScript,Vue

console.log(`front.splice(3, 1, "JDBC"): ${front.splice(2, 2, "JDBC")}`);   // splice(변경값부터, 변경될 갯수, 변경할 내용)
console.log(`front: ${front}`);                      // front: HTML,CSS,JavaScript,JDBC

/* join: 배열을 우리가 원하는 구분자와 함께 결합하여 문자열로 반환 */
const snackList = ['사탕', '마이쮸', '몽쉘', '허니버터칩'];

console.log(`snackList.join(): ${snackList.join()}`);         // snackList.join(): 사탕,마이쮸,몽쉘,허니버터칩
console.log(`snackList.join('/'): ${snackList.join('/')}`);   // snackList.join('/'): 사탕/마이쮸/몽쉘/허니버터칩

