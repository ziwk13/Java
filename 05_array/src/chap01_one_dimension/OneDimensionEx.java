package chap01_one_dimension;

import java.util.Arrays;

public class OneDimensionEx {

	public static void main(String[] args) {

		// 배열 선언
		String[] blackPink;  // 스택 영역에 참조 변수 blackPink가 생성 된다.

		// 배열 생성
		blackPink = new String[4];  // 힙 영역에 String 저장이 가능한 연속된 4개 메모리 공간이 생성 된다.
		// 그 중 첫 번째 공간의 참조값을 참조 변수 blackPink에 저장 한다.
		// 힙 영역에 생성된 4개 메모리 공간은 늘이거나 줄일 수 없다.

		// 배열 요소 사용(배열명과 대괄호를 붙이고 인덱스를 작성)
		blackPink[0] = "제니";
		blackPink[1] = "지수";
		blackPink[2] = "로제";
		blackPink[3] = "리사";

		// 배열 출력하기
		System.out.println(Arrays.toString(blackPink));

		// 배열 초기화(배열 선언 + 배열 생성 + 배열 요소에 값 저장) //

		// 배열 초기화 1 (배열 선언시에만 초기화가 가능 하다)
		String[] frontEnd = {"HTML", "CSS", "JAVASCRIPT", "REACT"};
		System.out.println(Arrays.toString(frontEnd));
		// 배열 초기화 2 (배열 선언과 초기화를 두 개의 코드로 분리 할 수 있다.)
		String[] backEnd;
		backEnd = new String[] {"MYSQL", "JAVA", "JSP/SERVLET", "SPRING"};
		System.out.println(Arrays.toString(backEnd));
		
		String[] soju = {"새로", "거꾸로", "가로", "똑바로" };
		
		System.out.println(Arrays.toString(soju)+ "주세요");
	}

}
