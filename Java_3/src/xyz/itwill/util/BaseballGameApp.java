package xyz.itwill.util;

import java.util.Random;
import java.util.Scanner;

//숫자야구게임: 0~9범위의 정수 난수값을 3개 제공받아 키보드로 입력하여 맞추는게임
//=>난수와 키보드 입력값은 0~9 범위의 3개의 정수값으로 서로 다르며 0으로 시작 불가능
//=>키보드 입력값이 형식에 맞지 않은 경우 재입력되도록 작성
//=>난수값과 입력값을 비교하여 동일한 정수값이 존재하는 경우 위치가 같으면 스트라이크 
//=>난수값과 입력값을 비교하여 동일한 정수값이 존재하는 경우 위치가 다르면 볼
//=>스트라이크가 3개면 성공 메세지 출력후 프로그램 종료하고 아니면 스트라이크 볼 개수 출력
//=>키보드로 정수값을 입력할 수 있는 기회는 15번제공
public class BaseballGameApp {
	public static void main(String[] args) {
		int chance=0;
		Random random=new Random();
		//0~9 범위의 정수값 3개를 저장하기 위한 배열 선언
		int[] dap=new int[3];
		while(true) {
			for(int i=0; i<dap.length; i++) {
				dap[i]=random.nextInt(10);
			}
			if(dap[0]!=0&& ) 
		}
		Scanner scanner=new Scanner(System.in);
	}
}
