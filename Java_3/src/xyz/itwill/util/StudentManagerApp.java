package xyz.itwill.util;

import java.util.List;

public class StudentManagerApp {
	public static void main(String[] args) {
		StudentManager manager=new StudentManager();
		
		//저장매체에 학생정보를 삽입하는 메소드 호출
		manager.insertStudent(new Student(1000,"홍길동"));
		manager.insertStudent(new Student(2000,"임꺽정"));
		manager.insertStudent(new Student(3000,"전우치"));
		manager.insertStudent(new Student(4000,"일지매"));
		
		if(manager.insertStudent(new Student(5000,"장길산"))) {
			System.out.println("[메세지] 학생정보를 성공적으로 삽입 하였습니다.");
		}else {
			System.out.println("[메세지]이미 저장된 학번의 학생정보이므로 삽입되지 않았습니다.");
		}
		System.out.println("===============================================");
		Student searchStudent=manager.selectStudent(2000);
		if(searchStudent != null) {
			
		}
		System.out.println("===============================================");
		List<Student> studentList=manager.selectStudentList();
		for(Student student : studentList) {
			System.out.println(student);  //toString() 메소드 자동 호출
		}
		System.out.println("===============================================");
}
}
