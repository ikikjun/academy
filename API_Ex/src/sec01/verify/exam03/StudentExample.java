package sec01.verify.exam03;

import java.util.HashMap;

public class StudentExample {
	
	public static void main(String[] args) {
		
		
		//Student 키로 총점을 지정하는 hashMap 객체 생성
		HashMap<Student, String> HashMap = new HashMap<Student, String>();
		
		// new Student("1")의 점수95를 저장
		hashMap.put(new Student("1"), "95");
		
		// new Student("1")로 점수를 읽어옴
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점 : " + score);
		
	}

}
