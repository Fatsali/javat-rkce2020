package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement06 {

	public static void main(String[] args) {
		// Kullanýcýdan sýnav notunu tam sayý olarak girmesini isteyin 
		//negatif girerse yanlýþ deger girdiniz ekrana yazdýrýn
		//50 den küçük girerse ekrana kaldýnýz yazdýrýn
		//80 den küçük ise geçtiniz yazdýrýn
		//100 den küçük ise ekrana tebrikler yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen sýnav notunuzu tam sayý olarak giriniz");
		int not=scan.nextInt();
		
		if(not<0) {
			System.out.println("Yanlýþ deger girdiniz");
		}
		else if(not<50) {
			System.out.println("Kaldýnýz");
		}
		else if(not<80) {
			System.out.println("Gectiniz");
		}
		else if(not<=100){
			System.out.println("Tebrikler");
		}
		else {
			System.out.println("100 den büyük deger giremezsiniz");
		}
		
	
		
		
		
		
		scan.close();

	}

}
