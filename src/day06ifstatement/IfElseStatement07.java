package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement07 {

	public static void main(String[] args) {
		// Kullan�c�dan 6 basamakl� bir say� isteyin. 0 ile de ba�layabilir
		//kazanma ihtimali %20, amorti ihtimali %30 olan kaybetme ihtimali %50olan bir
		//jackpot oyunu i�in bir program yaz�n�z
		//000000-000001-......-999998-999999===>1000000
		
		Scanner scan=new Scanner(System.in);
		System.out.println("6 basamakl� bir say� giriniz.S�f�r ba�ta kullan�labilir");
		int num=scan.nextInt();
		
		if(num<200000) {
			System.out.println("Kazand�n�z");
		}
		else if(num<500000) {
			System.out.println("Tekrar Deneyin");
		}else {
			System.out.println("Kaybettiniz");
		}
		
		
scan.close();
	}

}
