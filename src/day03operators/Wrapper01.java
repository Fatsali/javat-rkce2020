package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		
		//
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen ad�n�z� ve soyad�n�z� yaz�n�z");
		
		String isim=scan.nextLine();//String leri kullan�c�dan almak i�in ya next() veya nextLine()
		//kullan�r�z. next tek kelimelik Stringler i�in kullan�l�r. 
		//nextLine t�m Stringi almak i�in kullan�l�r.
		
		
		System.out.print(isim);
		
		scan.close();
		
		
		
		
		
		
		
		
		
		

	}

}
