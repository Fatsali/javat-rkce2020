package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		
		//
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen adýnýzý ve soyadýnýzý yazýnýz");
		
		String isim=scan.nextLine();//String leri kullanýcýdan almak için ya next() veya nextLine()
		//kullanýrýz. next tek kelimelik Stringler için kullanýlýr. 
		//nextLine tüm Stringi almak için kullanýlýr.
		
		
		System.out.print(isim);
		
		scan.close();
		
		
		
		
		
		
		
		
		
		

	}

}
