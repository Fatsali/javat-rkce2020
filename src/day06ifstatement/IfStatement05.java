package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		//kullan�c�dan bir dikd�rtgenin en ve boyunu al�n�z
		//en ve boy e�it ise ekrana "bu bir karedir yazd�r�n
		//en ve boy farkl� ise ekrana bu bir dikd�rtgendir yazd�r�n
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen dikd�rtgenin enini giriniz");
		int en=scan.nextInt();
		System.out.println("L�tfen dikd�rtgenin boyunu giriniz");
		int boy=scan.nextInt();
		//if(en==boy) {
		//	System.out.println("Kare");
		//}
		//if(en!=boy) {
			//System.out.println("Dikd�rtgen");
			
			
			
		//4}
		
		
		//else ==>diger ihtimallerin tamam� 
//en ile boy ya esittir yada de�ildir bu tip durumlarda 
		
		if(en==boy) {
			System.out.println("Bu bir karedir");
		}
		else {
			System.out.println("Bu bir dikd�rtgendir");
		}
		scan.close();
	}

}
