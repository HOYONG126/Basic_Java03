package xyz.itwill.util;

import java.util.Random;
import java.util.UUID;

public class NewPasswordApp {
	//새로운 비밀번호를 생성하여 반환하는 메소드 - Ramdom클래스 이용
	public static String newPasswordOne() {
		Random random=new Random();
		//비밀번호로 사용될 문자들이 저장된 문자열 생성
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!!~*";
		StringBuffer password=new StringBuffer();
		for(int i=1; i<=10; i++) {
			password.append(str.charAt(random.nextInt(str.length())));
		}
		return password.toString();
	}
	
	public static String newPasswordTwo() {
		//UUID 클래스 : 범용적으로 사용되는 식별자(고유값)를 생성하기 위한 기능을 메소드로 제공하는 클래스
		return UUID.randomUUID().toString().replace("-", "").substring(0,10).toUpperCase();
	}
	
	public static void main(String[] args) {
		System.out.println("새로운 비밀번호-1 ="+newPasswordOne());
		System.out.println("새로운 비밀번호-2 ="+newPasswordOne());
	}
}
