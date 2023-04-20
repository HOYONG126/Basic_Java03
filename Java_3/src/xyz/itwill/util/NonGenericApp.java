package xyz.itwill.util;

public class NonGenericApp {
	public static void main(String[] args) {
		NonGeneric nonGeneric1=new NonGeneric();
		
		//Integer 객체를 Object 클래스의 매개변수로 전달받아 Object 클래스의 필드값으로 변경
		nonGeneric1.setField(100); //오토박싱:정수값>> Integer 객체
		
		//필드값은 Object 클래스의 객체로 반환되므로 반드시 명시적 형변환 해야함 =>integer가 들어있는 object 객체
		Integer returnObject1=(Integer)nonGeneric1.getField();
		System.out.println("필드값 :"+returnObject1 ); //오토언박싱
		
		nonGeneric1.setField(100); //오토박싱:정수값>> Integer 객체
		
		
	}
}
