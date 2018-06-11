package co.uk.deven.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

/**
 * Date Time
 *
 */
public class DateTime {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2018, 2, 13);
		LocalTime time = LocalTime.of(6, 30);
		System.out.println(date);
		System.out.println(time);
		LocalDateTime dateTime = LocalDateTime.of(2018, 2, 13, 6, 30);
		System.out.println(dateTime);

		LocalDate dtnow = LocalDate.now();
		LocalDate dt = LocalDate.parse("2016-12-14");
		System.out.println(dt);
		System.out.println(dtnow);
		Period p = Period.between(dt, dtnow);
		System.out.println(p.getDays() + "  " + p.getMonths() + " " + p);
	}

}
