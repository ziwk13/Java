package chap01_URL;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

/*
 * java.net.URL 
 * 
 * 1. Uniform Resource Locator(통합 자원 식별자)를 표현하는 클래스
 * 2. 파일이나 웹 페이지 등 인터넷에 존재하는 자원에 접근 할 수 있는 주소(URL)를 구조화 하여 다룬다.
 * 3. URL 형식
 *    프로토콜://호스트:포트/경로?쿼리#참조값
 * 4. 주요 기능
 *    1) URL을 파싱하여 프로토콜, 호스트, 포트, 경로 등 각 구성 요소를 추출 할 수 있다.
 *       오직 파싱이 목적 이라면 java.net.URI 클래스를 활용하는 거싱 권장 된다.
 *    2) URLConnection 클래스와 함께 사용하여 실제 네트워크 통신을 수행 할 수 있다.
 * 5. URL 형식이 잘못된 경우 MalformedURLException이 발생한다. (Checked)
 */
public class Main {

	public static void main(String[] args) {

		try {
			
			URL url = new URL("http://www.example.com:8080/list?page=1&sort=DESC#memo");
			
			// 파싱(분석)
			System.out.println(url.getProtocol());  // https
			System.out.println(url.getHost());  // www.example.com
			System.out.println(url.getPort());  // 8080
			System.out.println(url.getPath());  // /list
			System.out.println(url.getQuery());  // page=1&sort=DESC
			System.out.println(url.getRef());  // memo
			
		} catch (MalformedURLException e) {
			System.out.println("URL 잘못");
		}
	}
}
