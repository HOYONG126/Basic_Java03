package xyz.itwill.exception;

public class ExceptionThrowsApp {
	public static void display() {
		
		int[] array= {10,20,30,40,50};
		
		for(int i=0; i<=array.length; i++) {
			System.out.println("array["+i+"]="+array[i]);
		}
		
	}
	
	public static void main(String[] args) {
		//ExceptionThrowsApp.display();
		display();
	}

}
