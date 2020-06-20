package day07nestedif;

import java.util.Scanner;

public class Nestedif02 {

	public static void main(String[] args) {
		// Kullanýcýdan password girmesini isteyin
		//password 4 basamaklý bir sayý ise çift olup olmadýðýný kontrol edin
		//çift ise ekrana "Password tamam" yazdýrýn
		//tek sayý ise ekrana"Tekrar deneyin" yazdýrýn
		//Password 4 basamaklý deðil ise "Tekrar deneyin
		//4 basamaklý demek 999 dan büyük 10000 den küçük demektir
		//0123 java için 123 tür.
		Scanner scan=new Scanner(System.in);
		System.out.println("Tam sayý olan bir password giriniz.");
		int password=scan.nextInt();
		if(password>999 && password<10000) {
			if(password%2==0) {
				System.out.println("Password tamam");
			}else if(password%2!=0)
				System.out.println("Tekrar deneyin ilk");
		}else {
			System.out.println("Tekrar deneyin son");
		}
		
		
		scan.close();
		
	}

}
