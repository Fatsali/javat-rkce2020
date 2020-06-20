package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		// Kullanýcýdan bir tam sayý isteyiniz ve o tam sayýnýn 
		//mutlak degerini ekrana yazdýrýn
		//mutlak deger bir sayýnýn kendi iþaretiyle çarpýlmasýdýr
		//örnek=0 ýn mutlak degeri 0 dýr.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir tam say giriniz");
		int num=scan.nextInt();
		if(num>0) {
		System.out.println(num*(+1));
		}
		else {
			System.out.println(num*(-1));
		}
		
		
scan.close();
	}

}
