package xyz.itwill.exception;

import java.util.Scanner;

//키보드로 정수값 2개를 입력받아 첫번째 정수값으로 두번째 정수값을 나눈 몫을 계산하여 출력하는 프로그램
public class CalcApp {
	public CalcApp() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("첫번째 정수값 입력 >> ");
		
		int num1=scanner.nextInt();
		System.out.println("두번째 정수값 입력 >> ");
		int num2=scanner.nextInt();
		
		System.out.print("결과 = "+num1+"/"+num2+"="+num1/num2);
		scanner.close();
		}
	
	public static void main(String[] args) {
		//new 연산자로 클래스의 생성자를 호출하여 객체 생성 - 생성자에 작성된 명령 실행
		new CalcApp();
	}

}
