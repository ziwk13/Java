package chap04_openapi.b_naver_captcha;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class NaverOpenAPI {

	public final static String clientId = "SzoQyoZFYhWMAeeay92I";
	public final static String clientSecret = "uhhyihwQzV";

	/**
	 * 캡차 키 요청 후 발급 받은 캠차 키를 반환 하는 메소드
	 * @return 네이버로 부터 발급 받은 캡차 키
	 */
	public static String captchaKey() throws Exception {

		String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=0";
		URL url = new URL(apiURL);
		HttpURLConnection con = (HttpURLConnection)url.openConnection();

		con.setRequestMethod("GET");
		con.setRequestProperty("X-Naver-Client-Id", clientId);  // 요청 헤더 설정
		con.setRequestProperty("X-Naver-Client-Secret", clientSecret);  // 요청 헤더 설정

		// 응답
		int responseCode = con.getResponseCode();
		BufferedReader in = null;
		if(responseCode == 200) {
			in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		} else {
			in = new BufferedReader(new InputStreamReader(con.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line = null;
		while((line = in.readLine()) != null) {
			sb.append(line).append("\n");
		}
		//		System.out.println(sb.toString());

		// 역직렬화 (JSON 문자열 -> Java 객체)
		Gson gson = new Gson();
		Type type = new TypeToken<Map<String, String>>(){}.getType();
		Map<String, String> map = gson.fromJson(sb.toString(), type);

		in.close();
		con.disconnect();

		return map.get("key");
	} 
	/**
	 * 캡차 이미지를 요청하는 메소드
	 * @param key 발급 받은 캡차 키
	 * @return 캡차 이미지 발급 성공 시 true 실패 시 false
	 */
	public static boolean captchaImage(String key) throws Exception {

		// 요청
		String apiURL = "https://openapi.naver.com/v1/captcha/ncaptcha.bin?key=" + key;
		URL url = new URL(apiURL);
		HttpURLConnection con = (HttpURLConnection)url.openConnection();

		con.setRequestMethod("GET");
		con.setRequestProperty("X-Naver-Client-Id", clientId);  // 요청 헤더 설정
		con.setRequestProperty("X-Naver-Client-Secret", clientSecret);  // 요청 헤더 설정

		// 응답 (캡차 이미지 내려 받기)
		int responseCode = con.getResponseCode();
		BufferedInputStream in = null;
		if(responseCode == 200) {
			in = new BufferedInputStream(con.getInputStream());
		} else {
			// BufferedReader/InputStreamReader/StringBuilder를 이용해 에러 처리를 별도로 해줘야 한다.
			System.out.println(error(con.getErrorStream()));
			return false;
		}
		String filename = System.currentTimeMillis() + ".jpg";
		File file = new File(filename);

		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
		byte[] b = new byte[1024];
		int readByte = 0;
		while((readByte = in.read(b)) != -1) {
			out.write(b, 0, readByte);

			System.out.println(file + " 다운 완료");
		}
		out.close();
		in.close();
		con.disconnect();
		
		System.out.println("캡차 이미지 파일명: " + filename);
		System.out.println("보안 문자를 입력 하세요 >>>");
		return true;  // 캡차 이미지 발급 성공
	}
	/**
	 * 캡차 이미지 요청이 실패하는 경우 실패 사유를 반환 하는 메소드
	 * @param in 에러 스트림
	 * @return 실패 사유
	 * @throws Exception
	 */
	private static String error(InputStream in) {

		StringBuilder sb = new StringBuilder();
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
			String line = null;
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			throw new RuntimeException("API 요청 및 응답 실패", e);
		}
		return sb.toString();
	}
	/**
	 * 캠차 이미지를 보고 사용자가 입력한 값이 올바른지 판단하는 메소드
	 * @param key 발급 받은 캠차 키
	 */
	public static void validateInput(String key) throws Exception {
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		String value = sc.next();  // 공백 문자 없이 입력

		// 요청
		String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=1&key=" + key + "&value=" + value;  // ?code=1 부분은 사용자 입력값 검증 이다.
		URL url = new URL(apiURL);
		HttpURLConnection con = (HttpURLConnection)url.openConnection();

		con.setRequestMethod("GET");
		con.setRequestProperty("X-Naver-Client-Id", clientId);  // 요청 헤더 설정
		con.setRequestProperty("X-Naver-Client-Secret", clientSecret);  // 요청 헤더 설정
		
		// 응답
		int responseCode = con.getResponseCode();
		BufferedReader in = null;
		if(responseCode == 200) {
			in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		} else {
			in = new BufferedReader(new InputStreamReader(con.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line = null;
		while((line = in.readLine()) != null) {
			sb.append(line).append("\n");
		}
		
		// 역직렬화 (JSON 문자열 -> Java 객체)
		Gson gson = new Gson();
		ApiResponse response = gson.fromJson(sb.toString(), ApiResponse.class);
		System.out.println("검증결과: " + response.isResult());
		System.out.println("입력 시간: " + response.getResponseTime() + "s");
		
		in.close();
		con.disconnect();
		sc.close();
	}
}
