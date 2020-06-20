package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {
	int num;
	public static void main(String[] args) {
		// Kullanýcýdan bir sayý alýn
		//sayý 10 dan küçük ise ekrana "Kazandýnýz" yazdýrýn
		//sayý 10 veya 10 dan büyükse ekrana "Tekrar deneyiniz" yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		int num=0;
		do {
			System.out.println("Bir sayý giriniz");
		    num=scan.nextInt();
		    }while(num>=10);
		
		System.out.println("Kazandýnýz");
		
scan.close();
	}

}
