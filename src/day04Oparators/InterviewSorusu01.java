package day04Oparators;

import java.util.Scanner;

public class InterviewSorusu01 {

	public static void main(String[] args) {
		
	// iki tane variable nin de�erlerini yer degistiriniz
		//sayi=12 sayi2=30 ======>sayi1=30 sayi2=12 b isleme swap denir
		
		//1.yol
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen yerlerini de�i�tirmek i�in iki say� giriniz.");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("yer degistirmeden �nce");
		System.out.println(sayi1);
		System.out.println(sayi2);
		
		
		double gecici=0.0;
		
		System.out.println();
		gecici=sayi1;
		sayi1=sayi2;
		sayi2=gecici;
		
		System.out.println("yer degistirdikden sonra");
		System.out.println(sayi1);
		System.out.println(sayi2);
		System.out.println(gecici);
		
		
		//2.yol bo� kap kullanmadan bu i� yap
		
		
		System.out.println("L�tfen yer degistirmek i�in iki say� daha giriniz");
		
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();
		
		sayi3=sayi3+sayi4;
		sayi4=sayi3-sayi4;
		sayi3=sayi3-sayi4;
		

		System.out.println("yer degistirdikden sonra");
		System.out.println(sayi3);
		System.out.println(sayi4);
		
		
		
	
		
		
		
		
		
		
		
		
		
		scan.close();
		

	}

}
