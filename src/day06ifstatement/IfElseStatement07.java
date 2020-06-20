package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement07 {

	public static void main(String[] args) {
		// Kullanýcýdan 6 basamaklý bir sayý isteyin. 0 ile de baþlayabilir
		//kazanma ihtimali %20, amorti ihtimali %30 olan kaybetme ihtimali %50olan bir
		//jackpot oyunu için bir program yazýnýz
		//000000-000001-......-999998-999999===>1000000
		
		Scanner scan=new Scanner(System.in);
		System.out.println("6 basamaklý bir sayý giriniz.Sýfýr baþta kullanýlabilir");
		int num=scan.nextInt();
		
		if(num<200000) {
			System.out.println("Kazandýnýz");
		}
		else if(num<500000) {
			System.out.println("Tekrar Deneyin");
		}else {
			System.out.println("Kaybettiniz");
		}
		
		
scan.close();
	}

}
