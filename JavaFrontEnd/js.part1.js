/** 변수와 상수 
 * let 변수 */
let hi = '정은지';
hi = '안녕하세요'; //let을 한번 더쓰게 되면 값을 변경하는게 아니라 변수를 재할당 -> 에러발생
console.log(hi);

/* const 상수(수정, 재할당이 안됨),(선언할때 반드시 값을 초기화 해줘야한다) */
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

/** 참조 데이터 타입 */
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