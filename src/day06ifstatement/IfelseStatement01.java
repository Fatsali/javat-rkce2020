package day06ifstatement;

import java.util.Scanner;

public class IfelseStatement01 {

	public static void main(String[] args) {
		//kullan�c�dan password girmesin isteyin
		//pasword do�ru ise ekrana "Password dogru"yazd�r�n
		//pasword yanl�� ise ekrana"password yanll�s tekrar deneyin" yazd�r�n
		//Dogru Password=Java2020
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen Password giriniz");
		String password=scan.next();
		
		//String lerin esitli�ini kontrol ederken asla "==" senbolu kullanmay�n�z
		//onun yerine "equals()"kullan�n
		//"==" Stringin degerini ve adresini kontrol eder
		//"equals()" ise sadece degerleri kontrol eder.
		
		if(password.equals("Java2020")) {
			System.out.println( "Pasword do�ru");
		}
		else {
			System.out.println("Pasword yanl�s tekrar deneyiniz.");
		}
		scan.close();
	}
}
