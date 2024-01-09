/** 변수와 상수 
 * let 변수 / 
*/
let hi = '정은지';
hi = '안녕하세요'; //let을 한번 더쓰게 되면 값을 변경하는게 아니라 변수를 재할당 -> 에러발생
console.log(hi);

// const 상수(수정, 재할당이 안됨),(선언할때 반드시 값을 초기화 해줘야한다)
const hello = '안녕하세요';
// hello = '12345';
console.log(hello);

/** 원시 데이터 타입 */
const number = 123n; // bigint
console.log(typeof number);

const name = '정은지';
console.log(typeof name);
// 백틱 `
const age = 20;
const job = '개발자';
// const msg = '저는 ' + job + '이고, ' + age + '살 입니다';
const msg2 = `저는 ${job}이고, ${age}살 입니다`; // 오 백틱 쉽다!!! 
console.log(msg2);

const isTrue = true;
console.log(typeof isTrue);

let hellllllo;
console.log(hellllllo);

