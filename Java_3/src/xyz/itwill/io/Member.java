package xyz.itwill.io;

import java.io.Serializable;

//객체 직렬화(Object Serialization) : 객체를 byte배열(원시데이터)로 변환하여 입력 또는 출력

//클래스를 객체 직렬화 처리하는 방법-객체 직렬화 클래스
//1.Serializable 인터페이스를 상속받아 클래스 작성


//회원정보(아이디, 이름, 전화번호)를 저장하기 위한 클래스-값을 저장하는 클래스를 vo클래스라 부른다.
public class Member implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3306639107947980039L;
	private String id;
	private String name;
	private String phone;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "아이디="+id+",  이름 = "+name+"전화번호 = "+phone;
	}
}
