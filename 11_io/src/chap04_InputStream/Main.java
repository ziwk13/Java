package chap04_InputStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * java.io.InputStream
 * 
 * 1. 바이트 기반 입력 스트림의 최상위 추상 클래스
 * 2. 파일, 네트워크 등으로부터 바이트 단위로 데이터를 읽어올 수 있다.
 * 3. 주요 하위 클래스
 *    1) FileInputStream
 *    2) BufferedInputSteam
 *    3) DataInputStream
 * 4. 주요 메소드
 *    1) int read() : 1 바이트를 읽어 int 값으로 반환 (읽을 데이터가 없으면 -1(EOF)을 반환)
 *    				  (1바이트를 int로 변환 하면 0~255 값으로 반환 되는데 이렇게 처리하면 -1과 반환하는 값의 차이를 만들 수 있다.)
 *    				  (1바이트를 byte 그대로 반환 하면 -128~127 값으로 반환 하는데 이러면 -1(EOF)와 반환 하는 값의 구분이 어렵다.)
 *    2) int read(byte[] b) : 전달한 바이트 배열 만큼 읽어서 배열에 저장 (읽은 데이터는 byte[] b에 저장 된다.
 *    						  실제로 읽은 바이트 수를 반환
 *    						  (읽을 데이터가 없으면 -1(EOF)을 반환)
 *    3) int read(byte[] b, int off, int len) : 전달한 바이트 배열의 일부만 사용해서 읽어 저장
 *    										    (읽을 데이터가 없으면 -1(EOF)을 반환)
 *    4) close() : 입력 스트림을 닫고 자원을 해제
 */

public class Main {

	public static void bufferedWriter() {

		File file = new File("C:/Program Files/Java/jdk-17", "README");

		try(BufferedInputStream bin = new BufferedInputStream(new FileInputStream(file))) {

			// int를 이용해 1바이트 단위로 파일 읽기

			int c;

			// 파일에서 읽은 데이터를 저장해 둘 byte[] 배열
			byte[] b = new byte[(int)file.length()];
			int i = 0;
			
			//			while(true) {
			//				c = bin.read();
			//				if(c == -1) {
			//					break;
			//				list.add((byte)c);
			//				} 

			while ((c = bin.read()) != -1 ) {  // 파일의 끝(EOF == -1)에 도달하지 않았다면 반복 한다.
				b[i++] = (byte)c;
			}
			System.out.println(new String(b));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void bifferedInputStream2() {
		File file = new File("C:/Program Files/Java/jdk-17", "README");

		try(BufferedInputStream bin = new BufferedInputStream(new FileInputStream(file))) {

			// byte[] 를 이용해 20바이트 단위로 파일 읽기
			byte[] b = new byte[20];

			// 파일에서 읽은 데이터를 저장해 둘 byte[] 배열
			byte[] bytes = new byte[(int)file.length()];
			int i = 0;
			
			// 파일로 부터 실제로 읽은 바이트 수
			int readByte = 0;
			
			while((readByte = bin.read(b)) != -1) {
				System.arraycopy(b, 0, bytes, i, readByte);
				i += readByte;
			}
			System.out.println(new String(bytes));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void systemIn() throws IOException {
		
		InputStream in = System.in;  // 표준 입력 스트림(키보드)을 연결
		
		int c;
		
		while((c = in.read()) != -1) { // EOF (ctrl + z)
			System.out.print((char)c);
		}
	}
	public static void dataInputStrema() throws IOException {
		
		File file = new File("D:/storage/test.bin");
		
		DataInputStream din = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
		
		// 저장되어 있는 순서대로 읽는다
		int x = din.readInt();  // writeInt() 생성한 값 읽기
		double y = din.readDouble();  // writeDouble()로 생성한 값 읽기
		String s = din.readUTF();  // writeUTF()로 생성한 값 읽기
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);  // 바이트 스트림 이지만 한글이 깨지지 않는다.
		
		din.close();
	}

	public static void main(String[] args) {
		
//		bufferedWriter();
//		bifferedInputStream2();
		try {
//			systemIn();
			dataInputStrema();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
