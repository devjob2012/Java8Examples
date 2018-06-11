package uk.dev.app.spring;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class TestCalendar {
	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println(now);
		LocalDateTime dateTime = LocalDateTime.of(2014, Month.APRIL, 1, 10, 45);
		System.out.println(dateTime);
		// testDob();
		Instant instant = Instant.now();
		// Output format is ISO-8601
		System.out.println(instant);
		LocalTime localTime = LocalTime.of(22, 33); // 10:33 PM
		localTime = LocalTime.MIN;
		System.out.println(localTime);
		LocalDate db = LocalDate.parse("2015-02-20");
		System.out.println(db.isLeapYear());
		
	}

	private static void testDob() {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		LocalDate dob = LocalDate.of(1999, 7, 12);
		System.out.println(dob);
		Period pd = Period.between(dob, currentDate);
		System.out.println(pd.getYears());
		System.out.println(pd.getDays());
		System.out.println(pd.getMonths());
	}
}
