package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		// Bu günün tarihini ekrana yazdýralým
		
		// bugünün tarihini
		System.out.println(LocalDate.now());
		// bugünün saatini 
		System.out.println(LocalTime.now());
		//bugünün tarihini ve saatini
		System.out.println(LocalDateTime.now());//2020-05-20T17:01:52.470 buradaki T tarih ile
	                                         	// zamaný aramak için konuluyor


	}

}
