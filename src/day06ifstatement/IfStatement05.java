package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		//kullanýcýdan bir dikdörtgenin en ve boyunu alýnýz
		//en ve boy eþit ise ekrana "bu bir karedir yazdýrýn
		//en ve boy farklý ise ekrana bu bir dikdörtgendir yazdýrýn
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen dikdörtgenin enini giriniz");
		int en=scan.nextInt();
		System.out.println("Lütfen dikdörtgenin boyunu giriniz");
		int boy=scan.nextInt();
		//if(en==boy) {
		//	System.out.println("Kare");
		//}
		//if(en!=boy) {
			//System.out.println("Dikdörtgen");
			
			
			
		//4}
		
		
		//else ==>diger ihtimallerin tamamý 
//en ile boy ya esittir yada deðildir bu tip durumlarda 
		
		if(en==boy) {
			System.out.println("Bu bir karedir");
		}
		else {
			System.out.println("Bu bir dikdörtgendir");
		}
		scan.close();
	}

}
