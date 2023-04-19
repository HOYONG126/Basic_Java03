package xyz.itwill.util;

import java.util.Calendar;

//현재 년월에 대한 달력을 출력하는 프로그램 작성
public class CurrentCalendarApp {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		
		//Calendar 객체에 날짜와 시간 중[일]을 [1일]로 변경
		//Calendar 객체에 날짜와 시간 중 [일]을 [1일]로 변경
		calendar.set(Calendar.DATE, 1);
		int week=calendar.get(Calendar.DAY_OF_WEEK);
		//System.out.println("week = "+ week);
		System.out.println("            "+calendar.get(Calendar.YEAR)+"년 "
						+calendar.get(Calendar.MONTH)+1);
	}
}
