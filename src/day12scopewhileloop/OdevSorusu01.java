package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		// Kullan�c�dan ya�ad��� �lkenin ismini al�n 
		//bu �lkenin bastan ikinci harfi ile sondan ikinci
		//harfini  b�y�k harf olarak ekrana yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen ya�ad���n�z �lkenin ismini giriniz.");
		String �lke=scan.nextLine();
		�lke=�lke.toUpperCase();
		System.out.print(�lke.substring(1, 2));
		int length=�lke.length();
		System.out.println(�lke.charAt(length-2));
scan.close();

	}

}
