package chap02_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Class03_java_time {

	public static void main(String[] args) {
		
		// 현재 날짜와 시간
		LocalDate date = LocalDate.now();
		System.out.println("날짜: " + date);
		LocalTime time = LocalTime.now();
		System.out.println("시간: " + time);
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("날짜와 시간: " + dateTime);

		// 원하는 단위만 가져오기
		int year = date.getYear();
		int month = date.getMonthValue();
		int day = date.getDayOfMonth();
		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + hour + "시 " + min + "분 " + sec + "초");
		
		// 원하는 형식 지정하기
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm");
		System.out.println(dtf.format(dateTime));
	}

}
