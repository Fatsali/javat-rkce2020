package day23date;

import java.time.LocalTime;

public class Date03 {

	public static void main(String[] args) {
		// time manipulation
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		System.out.println(time.plusSeconds(23));
		System.out.println(time.plusMinutes(45));
		System.out.println(time.plusHours(2));
		
		System.out.println(time.minusSeconds(23));
		System.out.println(time.minusMinutes(45));
		System.out.println(time.minusHours(2));
		
		LocalTime time1=LocalTime.now();
		System.out.println(time1);
		
	}

}
