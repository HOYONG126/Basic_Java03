package xyz.itwill.lang.thread;
//은행계좌정보(잔액)를 저장하기 위한 클래스- 입금 및 출력 프로그램
public class Account {
	
	private int balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(int balance) {
		super();
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//입력 처리 메소드
	public void deposit(int amount, String name) {
		balance+=amount;
		System.out.println("[입금알림]"+name+"님이 "+amount+"원 입금하여 잔액은 "+balance+"원 입니다.");
	}
	
	//출금 처리 메소드
	public void withDraw(int amount, String name) {
		if(amount>balance) {
			System.out.println("[에러]잔액부족 \n "+name+"님, 잔액이"+balance+"원 남아 "+amount+"원을 출금할 수 없습니다.");
			return;
		}
		balance-=amount;
		System.out.println("[입금알림]"+name+"님이 "+amount+"원 출금하여 잔액은 "+balance+"원 입니다.");
	}
}
