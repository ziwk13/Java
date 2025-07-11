package chap06_File.copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtils {

	public static void fileCopy(String originPath, String copyPath) {

		File origin = new File(originPath);  // 입력 대상
		File copy = new File(copyPath);  // 출력 대상
		long start = 0;
		long stop = 0;

		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(origin));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(copy))) {


			byte[] b = new byte[1024];  // 1KB(1024바이트) 단위로 복사 진행
			int readByte = 0;
			while((readByte = in.read(b)) != -1) {
				out.write(b, 0, readByte);
			}
			start = System.nanoTime();
			stop = System.nanoTime();
		} catch (FileNotFoundException e) {
			System.out.println("존재 하지 않는 파일");
		} catch (IOException e) {
			System.out.println("파일이 복사 안됨 ㅇㅇ");
		}
		System.out.println("[복사 결과]");
		System.out.println("[성공 여부: " + (origin.length() == copy.length()));
		System.out.println("복사 시간: " + ((stop - start) / 1_000_000.0) + "ms");
		System.out.println("원본: " + origin.getPath());
		System.out.println("복사본: " + copy.getPath());
	}
}
