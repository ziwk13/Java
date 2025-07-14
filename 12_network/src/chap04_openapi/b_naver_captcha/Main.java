package chap04_openapi.b_naver_captcha;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

public class Main {

	public static void main(String[] args) {
		
		
		try {
			// 1. 캡차 키 발급 요청
			String captchaKey =  NaverOpenAPI.captchaKey();
//			System.out.println(captchaKey);
			// 2. 캡차 이미지 발급 요청
			if (NaverOpenAPI.captchaImage(captchaKey));{
				// 3. 사용자 입력값 검증
				NaverOpenAPI.validateInput(captchaKey);
			} 
			
		} catch (Exception e) {
			if(e instanceof UnsupportedEncodingException) {
				System.out.println("검색어 인코딩 실패");
			} else if (e instanceof MalformedURLException) {
				System.out.println("잘못된 형식");
			} else if (e instanceof IOException) {
				System.out.println("API 요청 응답 실패");
			} else {
				System.out.println("알수 없음");
			}
		}

	}

}
