package xyz.itwill.lang.thread;

public class AccountUserApp {
	
	public static void main(String[] args) {
		Account account=new Account(10000); // 잔액 10000원
		
		//단일 스레드(main)를 이용하여 AccountUser 클래스로 객체 생성해 저장
		//=>은행계좌를 사용하는 사용자를 여러개 생성하여 같은 은행계좌를 사용하도록 설정
		AccountUser one=new AccountUser(account, "홍길동");
		AccountUser two=new AccountUser(account, "임꺽정");
		AccountUser three=new AccountUser(account, "전우치");
		
		//단일 스레드(main)을 이용하여 모든 은행꼐좌 사용자를 이용한 은행계좌의 입금 처리
		one.getAccount().deposit(5000, one.getUsername());
		two.getAccount().deposit(5000, two.getUsername());
		three.getAccount().deposit(5000, three.getUsername());
	}

}
