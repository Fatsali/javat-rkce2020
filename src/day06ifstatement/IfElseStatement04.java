package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement04 {

	public static void main(String[] args) {
	//kullanýcýdan yasýný alýn
		//yas 13 den az ise ekrana "Çalýþamaz" mesajý verin
		//yaþ 13 den 65 e kadar ise ekranan "Çalýþabilir"yazdýrýn
		//yaþ 65 den büyük ise ekrana "Emekli"yazdýrýn
		//negatif sayý girerse "Yaþ negatif olamaz" desin
		
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Yaþýnýzý giriniz");
		int yas=scan.nextInt();
		
	
		if (yas<0) {
			System.out.println("Yas negatif olamaz");
		}
		else if(yas<13) {
			System.out.println("Çalýþamaz");
		}
		else if(yas<=65) {
			System.out.println("Çalýþabilir");
		}
		else {
			System.out.println("Emekli");
		}
		
		
		scan.close();

	}

}
