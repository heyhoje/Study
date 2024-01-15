// 1. 조건문
/* if(조건) {
	
} */

const a = 10;
const b = 20;
if(a > b){
	console.log('a가 더 작아요!');
} else {
	console.log('거짓!! a가 더 커요!');
}

const c = 20;
if (a > b){
	console.log('a가 더 큽니다!');
} else if (b !== c){
	console.log('b와 c는 같지 않습니다.')
} else if(b === c){
	console.log('test! b랑 c가 같습니다!')
} else {
	console.log('여기는 언제 출력될까요? 모든게 거짓일때');
}

/* switch : 동일한 조건 -> 그 조건의 값에 따라 다른 명령을 실행할 수 있도록 분개 
*/
const num = 10;
switch(num){
	case 1:
		console.log(num);
		break;
	case 10:
		console.log(num);
		break;
	default:
		console.log('아무것도 해당되지 않아요!! ')
}

// 모듈러 연산을 통해 홀짝 판별
const number = 9;
if(number % 2 == 0){
	console.log(number + "는 짝수!");
} else {
	console.log(number + "는 홀수!")
}

switch (number % 2){
	case 0:
		console.log('짝수');
		break;
	case 1:
		console.log('홀수');
		break;
	default:
		console.log('잘못된 숫자입니다.')
}

// 2. 반복문 : 반복적으로 수행해야하는 동작을 처리하기 위해서 사용되는 제어문
// for문
/* for(반복을 위한 조건들 명세 : 시작값; 반복조건; 증감식){

} */
for(let i = 0; i < 5; i++){
	console.log(i);
}
let i = 0;
for(; i< 5; i++){
	console.log(i);
}
i = 0;
for(; i< 5;){
	console.log(i++);
}

for(let i = 0; i < 10; i++){
	if(i === 7){
		break;
	}
	console.log(i);
} // 0부터 6까지 출력

for(let i = 0; i < 10; i++){
	if(i === 7){
		continue;
	}
	console.log(i);
} // 0부터 9까지, 7제외하고 출력

console.log('-------------------');
// forOf : 반복이 가능한 객체(배열, 문자열 등)에서 사용할 수 있는 반복문의 종류
// 주어진 객체를 차례대로 순회하면서 주어진 코드를 실행하는 방식
// for(변수, of, 반복이 가능한 객체) 
const arr = [1, 2, 3];
for (const i of arr){
	console.log(i);
} // => 어떤 조건을 만족할때만 반복을 하는게 아니라 arr배열의 요소들을 처음부터 끝까지 순회를 하면서
// 내부에 지정된 코드를 실행하는 방식

console.log('-------------------');

// while : 괄호안의 지정된 조건이 만족할 동안, 내부 코드를 반복. 조건이 참일 동안!
// 진입하면서 위에서 무조건 조건을 판별
let j = 0;

while (j < 10){
	console.log(j++);
}

// do while : 조건문을 반복문의 끝 위치에서 판별
// 우선 첫번째로 진입! 무조건 한번은 실행문이 실행. 다음 반복문으로 넘어가기 전에 조건을 판별
j = 0;

do{
	console.log(j++);
} while (j < 10);