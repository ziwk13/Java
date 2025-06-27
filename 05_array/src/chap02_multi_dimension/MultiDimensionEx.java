package chap02_multi_dimension;

import java.util.Arrays;

public class MultiDimensionEx {

	public static void main(String[] args) {
		
		// 2차원 배열이란?
		// 1차원 배열이 여러 개 존재하는 경우 이 1차원 배열을 합치는 것을 의미 한다.

		// 2차원 배열 선언
		String[][] seats;
		
		// 2차원 배열 생성 (각 1차원 배열을 만드는 작업)
		seats = new String[3][];  // 1차원 배열이 3개 이다
	
		// 1차원 배열 생성 (1차원 배열의 길이를 만드는 작업)
		seats[0] = new String[2];  // 첫 번째 1차원 배열의 길이는 2 이다. seats[0]이 1차원 배열의 이름 이다.
		seats[1] = new String[5];  // 두 번째 1차원 배열의 길이는 5 이다. seats[1]이 1차원 배열의 이름 이다.
		seats[2] = new String[4];  // 세 번째 1차원 배열의 길이는 4 이다. seats[2]이 1차원 배열의 이름 이다.
		
		// 2차원 배열 요소 사용 (인덱스를 2개 사용 : 몇 번째 1차원 배열 인가? 1차원 배열 내 몇 번째 요소 인가?
		seats[0][0] = "ㅂㅂㅂ";
		seats[0][1] = "ㅈㅈㅈ";
		
		seats[1][0] = "ㅁㅁㅁ";
		seats[1][1] = "ㄴㄴㄴ";
		seats[1][2] = "ㅇㅇㅇ";
		seats[1][3] = "ㄹㄹㄹ";
		seats[1][4] = "ㅎㅎㅎ";
		
		seats[2][0] = "ㅋㅋㅋ";
		seats[2][1] = "ㅌㅌㅌ";
		seats[2][2] = "ㅊㅊㅊ";
		seats[2][3] = "ㅍㅍㅍ";
		
		// 2차원 배열 출력
		System.out.println(Arrays.toString(seats));
		
		// 2차원 배열 순회 1 (일반 for문)
		for (int i = 0; i < seats.length; i++) {  // 각 1차원 배열 순회
			for(int j = 0; j < seats[i].length; j++) {  // 찾아간 1차원 배열 요소 순회 하기
				System.out.print(seats[i][j] + ", ");
			}
			System.out.println();
		}
		// 2차원 배열 순회 2 (향상 for문)
		for(String[] lines : seats) {
			for(String seat : lines) {
				System.out.print(seat + ", ");
			}
			System.out.println();
		}
	}

}
