package review_1215;

import java.util.ArrayList;

// 김은경 파이썬
// 김세희 자바
// 이지은 자바
// 김민지 C
// 정은지 파이썬

// 자바 자격증을 보유한 학생
// 김세희 이지은

public class _nado_Quiz_09 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("김은경", "파이썬"));
		list.add(new Student("김세희", "자바"));
		list.add(new Student("이지은", "자바"));
		list.add(new Student("김민지", "C"));
		list.add(new Student("정은지", "파이썬"));
		
		// iterator를 써도 되지만 간단하게 반복문으로 			
		System.out.println("자바 자격증을 보유한 학생");
		System.out.println("-------------------");	
		for (Student student : list) {
			if(student.certification.equals("자바")) {
				System.out.println(student.name);
			}
		}
	}

}

class Student {
	public String name;
	public String certification;
	
	public Student(String name, String certification) {
		this.name = name;
		this.certification = certification;
	}
}