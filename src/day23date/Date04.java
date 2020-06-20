package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date04 {

	public static void main(String[] args) {
		// Date format�n� de�i�tirmek
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd.MMM.yyyy");
		System.out.println(dtf.format(date));
		
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.println(dtf1.format(date.plusMonths(7)));
		
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yyyy/M/dd");
		System.out.println(dtf2.format(date));
		
		// Time format�n� de�i�tirmek
		
		LocalTime time=LocalTime.now();
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("hh:mm");//HH kullan�rsan�z 24 l�k dilimi
		System.out.println(dtf3.format(time));
		
		//ba�ka �lkenin local zaman�n� almak???????
		
	    //System.out.println(time.now());
		
		
		
	}

}
