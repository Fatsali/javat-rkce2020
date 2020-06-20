package day09switchoperator;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		// kullanýcýya haftanýn gün numarasýný girsin
		//programýnýz günün ismini yazsýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen haftanýn bir gün numarasýný giriniz");
		int gün=scan.nextInt();
		
		switch(gün) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salý");
			break;
		case 3:
			System.out.println("Çarþamba");
			break;
		case 4:
			System.out.println("Perþembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Yanlýþ bir deðer girdiniz");
			
		}
		
		scan.close();
		

	}

}
