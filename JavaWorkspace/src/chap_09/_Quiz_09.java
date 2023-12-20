package chap_09;

import java.util.ArrayList;

// 김은경 파이썬
// 김세희 자바
// 정은지 자바
// 김민지 C
// 이지은 파이썬
public class _Quiz_09 {
    public static void main(String[] args) {
        ArrayList<StudentVO> list = new ArrayList<>();
        list.add(new StudentVO("김은경", "파이썬"));
        list.add(new StudentVO("김세희", "자바"));
        list.add(new StudentVO("정은지","자바"));
        list.add(new StudentVO("김민지", "C"));
        list.add(new StudentVO("이지은", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("---------------------");
        for(StudentVO student : list){
            if(student.certification.equals("자바")){
                System.out.println(student.name);
            }
        }
        // list.contains("자바") 가 아니라 forEach 향상된 for문으로 돌려서 객체.매개변수??가 "자바"와 같다면 이름 출력
        
    }
}

class StudentVO{
    public String name;
    public String certification;

    public StudentVO(String name, String certification) {
        this.name = name;
        this.certification = certification;
    }
}


