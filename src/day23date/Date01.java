package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		// Bu g�n�n tarihini ekrana yazd�ral�m
		
		// bug�n�n tarihini
		System.out.println(LocalDate.now());
		// bug�n�n saatini 
		System.out.println(LocalTime.now());
		//bug�n�n tarihini ve saatini
		System.out.println(LocalDateTime.now());//2020-05-20T17:01:52.470 buradaki T tarih ile
	                                         	// zaman� aramak i�in konuluyor


	}

}
