/* 볶음밥이라는 함수를 만들어서, 반복적인 동작을 처리하기 위해 사용 */
function friedrice(main) {
	console.log(`${main} 볶음밥`);
}

friedrice('새우');
friedrice('제육');

console.log('- 인자와 매개변수 -');
function sum(a,b){
	console.log(a + b);
}

sum(10, 20);

console.log('-지역변수와 전역변수 -');

const b = 10; /* 전역변수 : 선언부를 밖으로. */

function a() {
	const b = 20; /* 지역변수 : 함수 내부에서 선언된 변수는 함수 내부에서만 사용할 수 있다.  */
	console.log(b);
}
a();
console.log(b);
/* 전역변수가 같은 이름으로 함수 내부에서 재선언되는 경우 
console.log(b) -> 함수 내부에서는 지역변수값에만 접근 가능, 내부 지역변수 값이 출력 
									함수 외부에 있는 b에 접근하면 전역변수 값이 출력된다. */

console.log('- 호출된 인자의 개수가 부족한 경우 / Default Parameter -');
function sum(a,b = 0){ // b가 undefined로 설정되지 않게 매개변수 기본값 지정. 값이 전달된다면 기본값은 무시됨.
	console.log(a + b);
}

sum(10); // a + undefined = Not a Number. NaN 결과값만 안나올 뿐이지 에러가 뜨진 않는다. 
sum(10, 0);
sum(10, 20, 30); 

console.log('- argument 객체 -');
function sum2(c, d = 0){
	console.log(arguments[0]);
	console.log(arguments[1]);
	console.log(arguments[2]);
}
sum2(10, 20, 30); 

console.log('- 나머지 매개변수 / Rest Parameter -')
function print(a, b, ...rest) {
	console.log(a);
	console.log(b);
	console.log(rest);
}

print(10, 20, 30, 40, 50, 60, 70);

console.log('- 함수의 반환값 Return - ')
function sum3(a, b) {
	return a + b;
}

console.log(sum3(10, 20)); // 이 함수가 리턴하는 값을 출력! sum함수와 똑같이 작동함.
// return을 만나면 함수를 종료 -> 해당 함수를 호출한 위치로 return 값을 반환 -> sum(10, 20) 과 동일


console.log('- 함수의 표현식 -');
function sum(a, b){
	console.log(a + b);
}
sum(10, 20);

console.log('- 화살표 함수 -');
const sum4 = (a, b) => console.log(a + b); // 실행문이 한 줄 일 때는 중괄호 생략하면, return 명령문 생략 가능
const sum5 = (a, b) => { a + b };
// const sum5 = (a, b) => { return a + b; };

sum4(10, 20);
console.log(sum5(10, 20)); // 반환되는 값이 없기 때문에 undefined 뜸

console.log('- 화살표 함수에서 괄호를 생략할 수 있는 경우 -');
const sum6 = a => { return a + b; }; // 인자가 하나일 때! 

console.log('- 일반 함수를 화살표 함수로 바꾸기 -');
// function hello() {
// 	console.log('Hello!');
// 	console.log('World!!');
// }

const hello = () => {
	console.log('Hello!');
	console.log('World!!');
};
hello();

const sum7 = (a, b) => {
	return a + b;
};
console.log(sum7(10,30));

const greeting = user => {
	console.log(`Hello, ${user}님 안녕하세요`);
};
greeting('정은지');