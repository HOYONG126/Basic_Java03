package xyz.itwill.lang;

import java.util.Scanner;

//키보드로 사칙 연산식을 입력받아 연산결과를 계산하여 출력하는 프로그램 작성
//ex) 연산식 입력 >> 20 + 10
//    [결과]30
// => 입력 연산식에서 사용 가능한 연산자는 사칙 연산자(*,/,+,-)만 허용
// => 형식에 맞지 않는 연산식이 입력된 경우 에러 메세지 출력 후 프로그램 종료
// => 입력 연산식에 공백 입력이 가능하도록 처리
public class ConsoleCalculateApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("연산식 입력>>");
		String test=scanner.nextLine();
		//공백없애주고
		
		
		//연산식을 String으로 입력받고 공백을 없애주는 걸 써준뒤 2번째 부호에 따라 각 계산 다른 클래스 메소드로 보내준다
		//계산되면 계산값을 그 클래스 필드에 넣어 display라는 메소드를 통해 보여줄 수 있게만든다.
		//가져온다.
	}
}