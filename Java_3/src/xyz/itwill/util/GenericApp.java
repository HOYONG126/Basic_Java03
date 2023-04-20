package xyz.itwill.util;

//제네릭 타입의 필드가 선언된 클래스로 객체를 생성하여 사용하는 프로그램
//=> 제네릭 타입 대신 설정된 Java 자료형의 객체만 필드에 저장 가능-제한적인 객체 저장
public class GenericApp {
	public static void main(String[] args) {
		//제네릭 클래스를 사용할 경우 제네릭 타입 대신 사용된 Java 자료형을 전달
		//=>전달받은 Java 자료형을 제네릭 타입 대신 사용하여 필드 또는 메소드 완성
		Generic<Integer> generic1=new Generic<Integer>(); //필드의 자료형 : Integer
		
		//제네릭 타입 대신 사용될 Java 자료형과 동일한 자료형의 객체를 전달받아 피드값 변경
		generic1.setField(100); //오토박싱 : 정수값 >> Integer 객체
		Integer returnObject1=generic1.getField();
		System.out.println(returnObject1); //오토언박싱 : Integer 객체 >> 정수값
		System.out.println("==============================");
		Generic<Double> generic2=new Generic<>();
		generic2.setField(12.34);
		System.out.println(generic2.getField());
}
}
