/** 1. 변수와 상수 
 * let 변수 */
let hi = '정은지';
hi = '안녕하세요'; //let을 한번 더쓰게 되면 값을 변경하는게 아니라 변수를 재할당 -> 에러발생
console.log(hi);

/* const 상수(수정, 재할당이 안됨),(선언할때 반드시 값을 초기화 해줘야한다) */
const hello = '안녕하세요';
// hello = '12345';
console.log(hello);

/** 2. 원시 데이터 타입 */
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

/** 3. 참조 데이터 타입 */
// 배열
const arr = [1, 2, 3];
console.log(arr); // 배열변수 자체를 출력
console.log(arr[0]); // 인덱스를 이용해서 배열에 있는 특정 위치의 값에만 접근 가능ㄴ

// 객체
const obj = {
	name : '정은지',
	job : '개발자'
}
console.log(obj);
console.log(obj.name);
console.log(obj['job']);

const arr2 = [1, 2, 3, [4, 5]];
const arr3 = [1, 2, 3, {name:'정은지'}];
console.log(arr2);
console.log(arr3);

const obj2 = {
	arr : [1,2,3],
	something : {name : '정은지'}
};
console.log(obj2);


/** 4. 연산자
// 산술연산자 +, -, *, /, 모듈러(나머지 연산자), **(거듭제곱-지수연산자) 
 */

console.log(10 / 5);
console.log(10 % 5);
console.log(10 % 3);
console.log(2 ** 3);

// 증감연산자 ++1, --1
let num = 10;
num++;
console.log(num);
num--;
console.log(num);

// 비교연산자 <=, => / ==, === / !=
// a = 123, b = '123', 일때 => a == b true(추상비교) / a === b false(엄격비교)
const a = 10;
const b = 20;
console.log(a > b);
console.log(a === b);
console.log(a !== b);

// 논리연산자 &&, ||, !
const c = 2 < 3; // true
const d = 30 > 50; // false
console.log(c && d);
console.log(c || d);
console.log(!c);

// 삼항연산자 : 조건의 결과가 참인지 거짓인지에 따라서 다른 실행 결과를 가지는 연산을 수행.
// 조건 ? 참일때 실행될 부분 : 거짓일 때 실행될 부분
console.log(2 > 3 ? "참" : "거짓");

// 널리쉬 : null 병합 연산자. ?? : 여러 개의 피연산자 중 값이 확정되어 있는 변수를 찾음
const x = undefined;
const y = null;
const z = '정은지';
console.log(x ?? y ?? z); // 차례대로 보면서 각각의 변수가 null/undefined가 아닌 어떤 값이 확정되어 있는지 확인. 
// 값이 확정되어 있다면 해당 값을 선택

// 비트연산자 : 이진연산? 바이너리 연산을 수행하는 연산자. & | ~ ^ << >> 
// 이런 것들이 있다 정도만 짚고 넘어감. 자바스크립트에서 비트연산자를 지원하긴 하지만 사용할일이 그렇게 많지 않음.

// 대입연산자 : =
// 복합대입연산자 : +=, -+, *=, /=, %=
let num2 = 10;
num2 = num2 + 2;
num2 += 2;

// 전개구문(전개연산자) : 반복이 가능(배열, 문자열 -> 가지고 있는 요소를 각각 꺼내서 전개, 펼치는 역할)
// 											한 어떤 객체에 적용할 수 있는 문법의 종류. 
const numbers = [1,2,3];
console.log(numbers); // 배열로서 출력. 각각의 인덱스의 요소들이 들어있음
console.log(...numbers); // 인덱스 없이 이 요소들이 펼쳐져서 출력

const numbers2 = [4, 5, 6];
const newNumbers = [...numbers, ...numbers2]; // 손쉽게 합쳐서 새로운 배열을 만들 수 있다! 
console.log(newNumbers);