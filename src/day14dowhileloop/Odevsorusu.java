package day14dowhileloop;

import java.util.Scanner;

public class Odevsorusu {

	public static void main(String[] args) {
		// // Kullan�c�dan bir String al�n ve bu String�in ilk harfi ile
		//son harfinin yerlerini de�i�tirerek  ekrana yazd�r�n.
		//Ornegin; Kullan�c� �Java� girerse ekrana �aavJ� yazd�racaks�n�z.5)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir kelime veya c�mle giriniz");
		String str=scan.nextLine();
		
		char ilk=str.charAt(0);
		char son=str.charAt(str.length()-1);
		
		System.out.println(son+str.substring(1, str.length()-1)+ilk);
		

	}

}
