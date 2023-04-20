package xyz.itwill.util;

//제네릭(GENERIC):필드의 자료형(참조형) 대신 사용될 식별자-미지정 자료형
//=>java 자료형(참조형) 선언시 <> 기호에 제네릭 타입(식별자) 선언
//형식 ) public class 클래스명<제네릭, 제네릭, ...>
//=><>안에 제네릭 타입은, 기호를 사용하여 나열 선언 가능
//=> 제네릭 타입의 식별자는 대문자로 작성하는 것을 권장

public class Generic<T> { //제네릭 클래스
	private T field;
	public Generic() {
		// TODO Auto-generated constructor stub
	}
	
	public Generic(T field) {
		super();
		this.field = field;
	}

	public T getField() {
		return field;
	}
	public void setField(T field) {
		this.field = field;
	}
	
}
