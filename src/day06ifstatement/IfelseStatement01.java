package day06ifstatement;

import java.util.Scanner;

public class IfelseStatement01 {

	public static void main(String[] args) {
		//kullanýcýdan password girmesin isteyin
		//pasword doðru ise ekrana "Password dogru"yazdýrýn
		//pasword yanlýþ ise ekrana"password yanllýs tekrar deneyin" yazdýrýn
		//Dogru Password=Java2020
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen Password giriniz");
		String password=scan.next();
		
		//String lerin esitliðini kontrol ederken asla "==" senbolu kullanmayýnýz
		//onun yerine "equals()"kullanýn
		//"==" Stringin degerini ve adresini kontrol eder
		//"equals()" ise sadece degerleri kontrol eder.
		
		if(password.equals("Java2020")) {
			System.out.println( "Pasword doðru");
		}
		else {
			System.out.println("Pasword yanlýs tekrar deneyiniz.");
		}
		scan.close();
	}
}
