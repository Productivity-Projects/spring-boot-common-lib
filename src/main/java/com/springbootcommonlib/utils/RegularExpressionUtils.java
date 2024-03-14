package com.springbootcommonlib.utils;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class RegularExpressionUtils {

	public static String[] FIRST_NAMES = { "John", "Jane", "Michael", "Mary", "Robert", "Patricia", "David", "Linda",
			"Joseph", "Barbara" };
	public static String[] LAST_NAMES = { "Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia",
			"Rodriguez", "Wilson" };

	public static String generateRandomName() {
		Random random = new Random();
		String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
		String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
	    String name =firstName + " " + lastName;
	    String email = lastName + "@gmail.com";
		return name;
	}
	public static String generateRandomEmail() {
		Random random = new Random();
		String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
		String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
	    String email = firstName+lastName + "@gmail.com";
		return email;
	}

	public static LocalDateTime dateAttendedRange() {
		LocalDateTime startDateTime = LocalDateTime.of(2024, 2, 29, 9, 0);
        LocalDateTime endDateTime = LocalDateTime.of(2024, 2, 29, 11, 30);
        double randomMillis = startDateTime.until(endDateTime, ChronoUnit.MILLIS) * Math.random();
        LocalDateTime randomDateTime = startDateTime.plus((long) randomMillis, ChronoUnit.MILLIS);	
		return randomDateTime;
	}
	public static LocalDateTime attendeOutTime() {
		LocalDateTime startDateTime = LocalDateTime.of(2024, 2, 29, 2, 0);
        LocalDateTime endDateTime = LocalDateTime.of(2024, 2, 29, 6, 30);
        double randomMillis = startDateTime.until(endDateTime, ChronoUnit.MILLIS) * Math.random();
        LocalDateTime randomDateTime = startDateTime.plus((long) randomMillis, ChronoUnit.MILLIS);
		return randomDateTime;
	}

}
