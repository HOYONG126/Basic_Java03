package xyz.itwill.lang.thread;

//은행계좌 사용자정보(은행계좌, 사용자명)를 저장하기 위한 클래스
public class AccountUser { 
	private Account account; //은행계좌정보-포함관계
	private String username; //사용자명
	public AccountUser() {
	}
	public AccountUser(Account account, String username) {
		super();
		this.account = account;
		this.username = username;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
