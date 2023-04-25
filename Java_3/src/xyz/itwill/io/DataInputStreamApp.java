package xyz.itwill.io;
//-----object 중요------

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamApp {
	public static void main(String[] args) throws IOException {
		DataInputStream in = new DataInputStream(new FileInputStream("c:/data/data.txt"));
		
		//반드시 파일에 저장된 자료형의 순서대로 값을 읽어서 사용
		int value1=in.readInt();
	}
}
