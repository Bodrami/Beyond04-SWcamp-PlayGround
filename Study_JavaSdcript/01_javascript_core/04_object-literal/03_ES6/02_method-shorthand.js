/* 02. method-shorthand(메소드 단축) */

var dog1 = {
    name: '설탕이',
    eat: function(food) {
        console.log(`${food}를 냠냠 먹어요.`);
    }
};

dog1.eat('바난나');

/* ES6 이후부터는 메소드를 정의할 때 콜론(:)과 function 키워드를 생략한 축약 표현을 사용할 수 있다. */
var dog2 = {
    name: '설탕이',
    eat(food) {
        console.log(`${food}를 냠냠 먹어요.`);
    }
};

dog2.eat('새콤달콤 딸기');