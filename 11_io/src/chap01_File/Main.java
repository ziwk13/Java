package chap01_File;

import java.io.File;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * java.io.File
 * 
 * 1. 파일과 디렉터리(폴더)에 대한 정보를 관리하고, 생성/삭제 등 작업을 지원하는 클래스
 * 2. 파일 시스템의 파일이나 디렉터리에 대한 추상화를 통해 쉽게 작업을 처리 할 수 있다.
 * 3. 파일과 디렉터리의 실제 입출력(읽기/쓰기)을 담당하는 클래스는 아니다.
 * 4. 주요 기능
 *    1) 파일/디렉터리 조작
 *       생성, 삭제, 이름 변경 등
 *    2) 파일/디렉터리 정보 확인
 *       존재 여부, 경로, 이름, 크기 등
 */
/*
 * 파일/디렉터리 경로
 * 
 * 1. 경로 구분자 (Separator)
 *    1) Windows      : 역슬래시 (자바에서 역슬래시를 이스케이프 처리 : \\)
 *    2) Mac OS/Linux : 슬래시 (/)
 *    3) Windows를 이용한 개발과 Linux를 이용한 배포가 서로 다른 경로 구분자를 필요로 하므로 다음과 같이 해결 한다.
 *       (1) File.separator 필드를 활용 (운영체제에 따라서 자동으로 경로 구분자가 선택 된다.)
 *       (2) Windows에서 개발 할 때도 슬래시(/)를 사용 한다. (대부분 슬래시, 역슬래시 모두 경로 구분자로 인식 하도록 호환성을 제공 한다.)
 * 2. 예약된 디렉터리
 *    1) 현재 디렉터리 : .
 *    2) 상위 디렉터리 : ..
 *    3) 루트 디렉터리 : /
 *    4) 홈 디렉터리   : ~     
 */
public class Main {

	public static void handling() {
		// 디렉터리 만들기

		// 1. 생성할 디렉터리를 File 객체로 생성 (디렉터리를 여기서 만드는건 아니다)
		File dir = new File("C:/dev/Java/storage");

		// 2. 디렉터리 생성 (없으면 만드는 방식으로 진행 한다.
		if(!dir.exists() == false) {
			dir.mkdir();
		} else {
			System.out.println("이미 존재 해브러요");
		}
		// 3. 디렉터리 삭제 (있으면 삭제하는 방식으로 진행 된다)
		if(dir.exists()) {
			dir.delete();
		} else {
			System.out.println("없는거임");
		}
		// 현재 날짜를 디렉터리 이름으로 사용 해서 생성

		File dir2 = new File("C:/" + DateTimeFormatter.ofPattern("yyyy/MM/dd").format(LocalDate.now()));
		if(dir2.exists() == false) {
			dir2.mkdirs();
		}
	}
	public static void deleteDirectoryTree(String pathname) {
		//       실습. C:/2025/07/10 디렉터리를 모두 삭제하세요.
		// 	     비어있는 디렉터리만 삭제 할 수 있으므로 아래 과정이 필요하다.
		//       C:/2025/07/10 삭제 -> C:/2025/07 삭제 -> C:/2025 삭제
		
		File dir = new File(pathname); // 최초 호출 시 "C:/2025/07/10" 경로
									   // "D:" 경로(루트 경로로 인식: 부모 디렉터리가 없는 
		if(dir.getParentFile() == null) {  // 부모 디렉터리가 없으면! 
			return;
		}
		
		dir.delete();  // 최초 호출 시 "C:/2025/07/10" 삭제
		
		deleteDirectoryTree(dir.getParent());  // 상위 디렉터리 정보를 넘김
	}
	public static void information() {

		// JAVA_HOME 디렉터리를 File 객체로 생성
		File dir = new File("C:/Program Files/Java/jdk-17");

		// JAVA_HOME 디렉터리에 포함된 모든 파일/디렉터리를 File[] 배열로 가져옴
		File[] files = dir.listFiles();

		// StringBuilder 객체 생성
		StringBuilder sb = new StringBuilder();
		
		// 하나씩 정보 확인
		for(File file : files) {

			// 수정 한 날짜
			sb.append(String.format("%-30s", new SimpleDateFormat("yyyy-MM-dd  a hh:mm").format(file.lastModified())));
			// 유형 (파일/디렉터리)
			sb.append(String.format("%-10s", file.isDirectory() ? "<DIR>" : ""));
			// 크기
			sb.append(String.format("%10s", file.isFile() ? new DecimalFormat("#,##0").format(file.length()) : ""));
			//이름
			sb.append(" ").append(file.getName()).append("\n");
		}
		// 결과 확인
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {

		handling();  // 실습. C:/2025/07/10 디렉터리를 모두 삭제하세요.
		deleteDirectoryTree("C:/2025/07/10");
//		information();
	}
}
