package chap_10;

// 미술관 입장료
// -----------
// 챈들러, 레이첼, 모니카 5000원
// 벤자민, 제임스 무료

import java.util.ArrayList;

// map()을 이용하여 원하는 형태로 데이터 가공
// 삼항연산자(int max = a > b ? a : b ;)
public class _Quiz_10 {
    // 스트림을 이용하여 미술관 방문 손님에게 적절한 입장료를 안내하는 프로그램을 작성하시오
    // 공부 : ArrayList<String, 정수형 변수 등> / <객체> 도 써보도록 예제 출제
    public static void main(String[] args) {
        ArrayList<Customer> list = new ArrayList<>();
        list.add(new Customer("챈들러",50));
        list.add(new Customer("레이첼", 42));
        list.add(new Customer("모니카", 21));
        list.add(new Customer("벤자민", 18));
        list.add(new Customer("제임스", 5));

        System.out.println("미술관 입장료");
        System.out.println("-----------");
        // 객체 데이터를 안에서 어떻게 가공할 수 있는지
        list.stream().map(x -> x.age < 20 ? x.name + " 무료" : x.name + " 5000원")
                .forEach(System.out::println);
    }
}

class Customer {
    public String name;
    public int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}