package xyz.itwill.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamApp {
	public static void main(String[] args) throws IOException {
		DataOutputStream out = new DataOutputStream(new FileOutputStream("c:/data/data.txt"));
		
		//DataOutputStream.writeInt(int v): 매개변수로 정수값을 전달받아 원시데이타로 변환하여 출력스트림으로 전달하는 메소드
		out.writeInt(100);
	}
}
