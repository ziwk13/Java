package chap02_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 * java.sql.PreparedStatement
 * 
 * 1. 자바에서 데이터베이스 쿼리문을 실행 하기 위해 사용 하는 인터페이스
 * 2. PreparedStatement 객체를 생성하기 전에 미리 쿼리문이 완성되어 있어야 한다.
 * 3. 주요 특징
 *    1) 파라미터 바인딩 : 쿼리문에서 값이 들거갈 자리에 "?" (Placeholder)를 사용 하고, 실행 전에 값을 바인딩 한다.
 *    2) SQL Injection 방지 : 파라미터 바인딩을 통해 입력되는 값이 자동으로 이스케이프 처리 되기 때문에 SQL Injection을 예방 한다.
 */
public class Main {
	
	public static void insert() throws Exception {
		
		// DB 접속
		Connection con = DBConnection.getConnection();
		
		// 쿼리문
		String sql = "INSERT INTO tbl_board(uid, title, content) VALUES(?, ?, ?)";
		
		// PreparedStatement 객체 생성 (쿼리문 실행 객체)
		PreparedStatement ps = con.prepareStatement(sql);
		
		// tbl_board 테이블에 저장 할 값 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자 아이디(1,2,3) 입력 >>>"); int uid = sc.nextInt(); sc.nextLine();
		System.out.print("사용자 제목 입력 >>>"); String title = sc.nextLine();
		System.out.print("사용자 내용 입력 >>>"); String content = sc.nextLine();
		sc.close();
		
		// 입력 받는 값으로 파라미터 바인딩
		ps.setInt(1, uid);  // 1번째 ?에 uid 바인딩
		ps.setString(2, title);  // 2번째 ?에 title 바인딩
		ps.setString(3, content);  // 3번째 ?에 content 바인딩
		
		// 쿼리문 실행 (DML은 executeUpdate() 메소드를 호출한다)
		int count = ps.executeUpdate();  // 쿼리문 실행이 성공한 행(Row)의 개수를 반환 한다. (성공 시 1 반환, 실패 시 0 반환)
		
		// 결과 확인
		System.out.println(count + " 행이 삽입 되었습니다.");
		
		// 자원 해제
		ps.close();  // 나중에 만든 자원 먼저 해제
		con.close();
	}
	public static void update() throws Exception {
		
		// DB 접속
		Connection con = DBConnection.getConnection();
		
		// 쿼리문
		String sql = "UPDATE tbl_board SET title = ?, content = ?, modified_at = NOW() WHERE bid = ?";
		
		// 쿼리문 실행 객체
		PreparedStatement ps = con.prepareStatement(sql);
		
		// tbl_board 테이블에 수정 할 값 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("수정 할 bid 입력 >>>"); int bid = sc.nextInt(); sc.nextLine();
		System.out.print("수정 할 내용 입력 >>>"); String title = sc.nextLine();
		System.out.println("수정 할 본문 입력 >>>"); String content = sc.nextLine();
		sc.close();
		
		// 입력 받는 값으로 파라미터 바인딩
		ps.setString(1, title);
		ps.setString(2, content);
		ps.setInt(3, bid);
		
		// 쿼리문 실행
		int count = ps.executeUpdate();
		
		// 결과 확인
		System.out.println(count + " 행이 수정 되었습니다.");
		
		// 자원 해제
		ps.close();
		con.close();
	}
	public static void delete() throws Exception {
		
		// DB 접속
		Connection con = DBConnection.getConnection();
		
		// 쿼리문
		String sql = "DELETE FROM tbl_board WHERE bid =?";
		
		// 쿼리문 실행 객체
		PreparedStatement ps = con.prepareStatement(sql);
		
		// tbl_board 테이블 행 삭제
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 bid 입력>>>"); int bid = sc.nextInt();
		sc.close();
		
		// 입력 받는 값으로 파라미터 바인딩
		ps.setInt(1, bid);
		
		// 쿼리문 실행
		int count = ps.executeUpdate();
		
		// 결과 확인
		System.out.println(count + " 행이 삭제 되었습니다");
		
		// 자원 해제
		ps.close();
		con.close();
		
	}

	public static void main(String[] args) {
		try {
//			insert();
//			update();
			delete();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
