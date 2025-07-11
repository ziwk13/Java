package chap02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * java.io.OutputStream
 * 
 * 1. 바이트 기반 출력 스트림들의 최상위 추상 클래스 (직접 인스턴스를 생성 할 수 없다)
 * 2. 데이터를 외부(파일, 네트워크 등)로 바이트 단위로 출력 한다.
 * 3. 주요 하위 클래스
 * 	  1) FileOutputStream
 * 	  2) BufferedOutputStream
 *    3) DataOutputStream
 *    4) PrintStream
 * 4. 주요 메소드
 *    1) write(int b)    : 1바이트를 출력 한다. (4바이트 중 하위 1바이트만 사용 한다.)
 *    2) write(byte[] b) : 바이트 배열 전체를 출력 한다.
 *    3) write(byte[] b, int off, int len) : 바이트 배열 일부를 출력 한다. (인덱스 off부터 len개 만큼)
 *    4) flush() : 버퍼에 남아있는 데이터를 모두 출력 하고 버퍼를 비운다.
 *    5) close() : 출력 스트림을 닫고 시스템 자원을 해제 한다.
 */

public class Main {

	public static void fileCreate() {

		// 신규 파일 생성 모드 (항상 새로운 파일을 만든다. 기존 파일이 있다면 덮어쓰기 한다.)

		File dir = new File("D:/storage");  // new File("/storage")
		File file = new File(dir, "test.dat");

		OutputStream os = null;  // try, catch, finally 블록에서 모두 접근 가능한 Sccope에서 선언 한다. 

		try {
			os = new FileOutputStream(file);  // 출력 스트림 os 생성 (file로 통하는 출력 통로 생성)

			//			os.write('A');  // 1 바이트만 출력 (정상 출력)
			os.write('홍');  // 1 바이트만 출력
			// '홍'의 유니코드값은 U+D64D (1101 0110 0100 1101)
			// 유니코드 값 중 마지막 1바이트만 출력 (실제 출력은 0100 1101)
			// 0100 1101 == 77 이므로 코드값 77인 문자 'M'이 출력 된다.

			byte[] bytes = "Hello World".getBytes();

			os.write(bytes);  // byte[] 배열 전체를 출력 한다.
			os.write(bytes, 0, 5); // 인덱스 0부터 5개 요소만 출력 한다.

		} catch (FileNotFoundException e) {
			System.out.println(file.getPath() + " 파일을 찾을 수 없습니다. ");
		} catch (IOException e) {
			System.out.println("파일이 가다가 넘어졌어요");
		} finally {
			try {
				if(os != null) {
					os.close();
				}
			} catch (IOException e2) {
				System.out.println("출력 스트림 종료 시 오류가 발생 했습니다.");
			}
		}
	}
	public static void fileAppend() {

		// 파일 추가 모드 (기존 파일의 끝에 데이터를 추가 한다. 기존 파일이 없다면 새로 생성 한다.)

		File file = new File("D:/storage", "test.dat");

		OutputStream os = null;

		try {
			os = new FileOutputStream(file, true);  // true를 추가 하면 파일 추가 모드가 된다.

			os.write('!');

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(os != null)
					os.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public static void tryWithResources() {

		// try-with-resources 문법 : try에서 생성한 자원 해제가 자동으로 이루어지는 문법. (close 생략)

		File file = new File("D:/storage/test.dat");

		try(OutputStream os = new FileOutputStream(file, true)) {
			os.write('?');
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void bufferedOutputStream() {

		/*
		 * java.io.BufferedOutputStream
		 * 
		 * 1. java.io.FileOutputSteam 클래스의 하위 클래스
		 * 2. 출력 스트림의 기능에 내부 버퍼(대략 8KB)를 추가 하여 출력 효율을 높인 클래스
		 * 3. 내부 버퍼에 쌓인 출력 데이터는 내부 버퍼가 가득 차거나, flush() 호출, close() 호출 시 한 번에 출력 된다.
		 */

		File file = new File("D:/storage/test.dat");

		try(FileOutputStream fos = new FileOutputStream(file);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			bos.write("Hello World".getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void dataOutputStream() {
		
		/*
		 * java.io.DataOutputStream
		 * 
		 * 1. 기본 타입(Primitive Type) 데이터와 문자열(String)을 이진(binary) 형태로 출력 할 수 있도록 해주는 보조스트림 클래스
		 * 2. 주요 메소드
		 *    1) writeInt(int value)
		 *    2) writeDouble(double value)
		 *    3) writeUTF(String s) : UTF-8 인코딩으로 문자열 출력
		 */
		
		File file = new File("D:/storage/test.bin");
		
		DataOutputStream dos = null;
		
		try {
			dos = new DataOutputStream( new BufferedOutputStream( new FileOutputStream(file)));
			
			// 기본 타입 출력
			dos.writeInt(12345);
			dos.writeDouble(45.3443);
			
			// String 출력
			dos.writeUTF("오늘 점심은 초밥 아주 nice!");
			
			dos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {

		// fileCreate();
		// fileAppend();
		// tryWithResources();
		// bufferedOutputStream();
		dataOutputStream();

	}

}
