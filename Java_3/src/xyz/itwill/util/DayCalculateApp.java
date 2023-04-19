package xyz.itwill.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//키보드로 생년월일을 입력받아 오늘까지 살아온 날짜(일)을 계산하여 출력하는 프로그램 작성
//ex) 생년월일 입력[ex. 2000-01-01] >> 2023-04-18
//    [결과]태어난지 <1일>이 지났습니다. 
// => 형식에 맞지 않는 생년월일을 입력한 경우 에러 메세지 출력 후 프로그램 종료
public class DayCalculateApp {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("태어난 날을 입력하시오 >> ex2000-01-01");
			String birthDate=scanner.nextLine();
			
			String[] YMD=birthDate.split("-");
			
			Date now=new Date();
			Date birth=new Date(Integer.parseInt(YMD[0]),Integer.parseInt(YMD[1]),Integer.parseInt(YMD[2]));
		//	System.out.println((now-birth)/1000*86400+"일 지났습니다.");
	}
}
