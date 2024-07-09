/* 01. object-distructuring-assignment-basic-syntax(객체 구조 분해 할당 기본 유형) */

let pants = {
    productName: '배기팬츠',
    color: '검정색',
    price: 34000,
    getInfo() {
        console.log(this.productName, '쵸항!!!!');
    }
};

// let productName = pants.productName;
// let color = pants.color;
// let price = pants.price;

// let { productName, color, price } = pants;
let { productName, price, color, getInfo } = pants;      // 배열은 객체가 가진 순서대로 넣어주어야 하는데 구조분해 할당에서는 
                                                // 객체에 담긴 값이 그대로 전달되기 때문에 순서가 달라도 값 전달이 잘이루어진다.

console.log(productName, color, price);

console.log(getInfo);
// pants.getInfo();
getInfo();

/* 객체 구조분해 할당으로 꺼낸 변수 대신 다른 걸 쓰고 싶다면.. */
let {color: co, price: pr, productName: pn} = pants;
console.log(co, pr, pn);