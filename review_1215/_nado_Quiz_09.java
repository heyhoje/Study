package review_1215;

import java.util.ArrayList;

// ������ ���̽�
// �輼�� �ڹ�
// ������ �ڹ�
// ����� C
// ������ ���̽�

// �ڹ� �ڰ����� ������ �л�
// �輼�� ������

public class _nado_Quiz_09 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("������", "���̽�"));
		list.add(new Student("�輼��", "�ڹ�"));
		list.add(new Student("������", "�ڹ�"));
		list.add(new Student("�����", "C"));
		list.add(new Student("������", "���̽�"));
		
		// iterator�� �ᵵ ������ �����ϰ� �ݺ������� 			
		System.out.println("�ڹ� �ڰ����� ������ �л�");
		System.out.println("-------------------");	
		for (Student student : list) {
			if(student.certification.equals("�ڹ�")) {
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