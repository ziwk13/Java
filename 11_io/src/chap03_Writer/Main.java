package chap03_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * java.io.Writer
 * 
 * 1. 문자(Character) 기반 출력 스트림의 최상위 추상 클래스 (직접 인스턴스 생성 할 수 없다)
 * 2. 문자 데이터를 파일, 네트워크 등으로 출력 할 때 사용
 * 3. 주요 하위 클래스
 *    1) FileWriter
 *    2) BufferedWriter
 *    3) PrintWriter
 * 4. 주요 메소드
 *    1) write(int c) : 문자 1개를 출력
 *    2) write(char[] cbuf) : 문자 배열 전체를 출력
 *    3) write(String str) : 문자열 전체를 출력
 *    4) write(String str, int off, int len) : 문자열의 일부만 출력 (인덱스 off 부터 len개 만큼)
 *    5) flush()
 *    6) close()
 */

public class Main {
	
	public static void fileWriter() {
		File file = new File("D:/storage/test.txt");
		
		try(FileWriter out = new FileWriter(file)) {
			out.write('안');  // int 출력
			out.write("녕하세요 요세하녕안".toCharArray());  // char[] 출력
			out.write("어디로 가야 하죠 아저씨?");  // String 출력
			
			out.write("점심은 초밥 파티".toCharArray(), 0, 4);  // char[] 출력
			out.write("모둠초밥 두개 먹어야지", 0, 5);  // String 출력
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void bufferedWriter() {
		
		/*
		 * java.io.BufferedWriter
		 * 
		 * 1. 내부 버퍼를 이용해서 한번에 출력 하는 보조 스트림 (기본 8192자)
		 * 2. newLine() 메소드를 지원한다. (시스템에 따른 개행 문자 출력)
		 */
		
		File file = new File("D:/storage/test.txt");
		
		try(BufferedWriter out = new BufferedWriter(new FileWriter(file, true))) {
			
			out.newLine();
			out.write("점심은 1시 입니다");
			out.newLine();  // \n 사용해도 동일 하다.
			out.write("하지만 배가 고픕니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void printWriter() {
		
		/*
		 * java.io.PrintWriter
		 * 
		 * 1. print, println, printf 등 다양한 출력 메소드를 지원 하여 각종 데이터를 쉽게 출력 할 수 있다.
		 * 2. Writer 클래스를 상속하는 메인 스트림 중 하나이다.
		 */
		File file = new File("D:/storage/test.txt");
		
		try(PrintWriter out = new PrintWriter(file)) {
			
			out.println("밥은 언제 먹죠?");
			out.println("조금만 참아 보죠");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
//		fileWriter();
//		bufferedWriter();
		printWriter();
	}

}
