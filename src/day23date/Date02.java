package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
		// Date Manipulation date �zerinde de�i�iklikler yapmak. 
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		System.out.println(date.plusDays(3));
		System.out.println(date.plusDays(13));// g�n fazla olunca ay veya y�l da de�i�ir. 
		System.out.println(date.plusDays(-1));// bu �ok kullan�lmaz ba�ka method var. 
		System.out.println(date.plusWeeks(2));
		System.out.println(date.plusMonths(2));
		System.out.println(date.plusYears(2));
		
		
		System.out.println(date.minusDays(3));
		System.out.println(date.minusWeeks(1));
		System.out.println(date.minusMonths(2));
		System.out.println(date.minusYears(2));
	}

}
