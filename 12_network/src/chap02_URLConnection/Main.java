package chap02_URLConnection;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * java.net.URLConnection
 * 
 * 1. 자바 애플리케이션과 URL간의 통신 링크를 나타내는 추상 클래스
 * 2. URL을 통해서 네트워크 리소스에 접근하여 데이터를 읽거나 쓸 수 있는 표준 API를 제공 한다.
 * 3. java.net.URL 객체의 openConnection() 메소드를 호출 하여 URLConnection 클래스의 하위 클래스의 객체를 얻을 수 있다.
 * 4. HTTP 프로토콜의 경우 HttpURLConnection 클래스가 하위 클래스로 지원 된다.
 * 5. 데이터 입출력의 경우 바이트 기반 스트림이 사용되기 때문에
 *    입력 스트림(getInputStream())과 출력 스트림(getOutputStream())을 이용해 서버와 데이터를 주고 받을 수 있다.
 */

public class Main {
	public static void byteStream() throws MalformedURLException, IOException {
		
		URL url = new URL("https://image7.coupangcdn.com/image/coupang/common/logo_coupang_w350.png");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();  // 접속 링크 얻어내기
		con.connect();  // 실제 접속(getInputStream(), getOutputStream(), getResponseCode() 등 실제 접속을 유발하는(트리거) 다룬 메소드를 함께 사용 하여 생략 가능)
		
		int responseCode = con.getResponseCode();  // HTTP 상태코드 (200: OK, 404: Not Found 등)
		
		BufferedInputStream in = null; // 이미지 서버로부터 데이터를 입력 받는 버퍼스트림
		
		if(responseCode == HttpURLConnection.HTTP_OK) {  // if(responseCode == 200)
			in = new BufferedInputStream(con.getInputStream());  // 접속 링크로부터 입력 스트림을 받아서 버퍼를 추가한 방식
		} else {
			in = new BufferedInputStream(con.getErrorStream());  // 에러 전용 입력 스트림으로 에러 사유를 받아볼 수 있도록 처리
		}
		String filename =  url.getFile().substring(url.getFile().lastIndexOf("/") + 1);
		File file = new File(filename);  // 저장 디렉터리 지정 없이 파일명만 전달
		
		BufferedOutputStream out = null;  // 이미지 서버로 부터 받은 데이터를 로컬에 출력 하기 위한 버퍼스크림
		out = new BufferedOutputStream(new FileOutputStream(file));

		byte[] b = new byte[1024];  // 1KB 단위로 이미지 서버로부터 데이터를 받아온다
		int readByte = 0;  // 실제로 읽은 데이터의 바이트 수
		while((readByte = in.read(b)) != -1) {  // 파일의 끝(EOF == -1)에 도달하지 않았다면 계속 읽어오기
			out.write(b, 0, readByte);  // 실제로 읽은 데이터만 출력스트림으로 보내기 (로컬로 보내기)
		}
		
		out.close();
		in.close();
		con.disconnect();  // 접속 링크 끊기
		
		System.out.println(file.getPath() + " 파일다운완");
	}
	
	public static void charStream() throws MalformedURLException, IOException {
		
		URL url = new URL("https://www.google.com/robots.txt");
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.connect();
		
		int responseCode = con.getResponseCode();
		
		BufferedReader in = null;
		if(responseCode == HttpURLConnection.HTTP_OK) {
			in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		} else {
			in = new BufferedReader(new InputStreamReader(con.getErrorStream()));
		}
		
		String filename = url.getFile().substring(url.getFile().lastIndexOf("/") + 1);
		File file = new File(filename);
		
		BufferedWriter out = new BufferedWriter(new FileWriter(file));
		String line = null;
		while((line = in.readLine()) != null) {
			out.write(line);  // 서버로부터 읽은 텍스트 한 줄을 로컬 파일로 보내고,
			out.newLine();  // 로컬 파일의 줄 바꿈 처리
		}
		
		in.close();
		out.close();
		con.disconnect();
		
		System.out.println(file.getPath() + "읽기 완");
	}

	public static void main(String[] args) {
	
		try {
//			byteStream();
			charStream();
		} catch (MalformedURLException e) {
			System.out.println("URL 형식이 잘못");
		} catch (IOException e) {
			System.out.println("데이터 잘 못");
		}

	}

}
