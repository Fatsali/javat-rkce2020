package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		
		//Kullan�c�dan ad ve soyad�n� alal�m ekrana yazd�ral�m
		//kullan�c�dan adresini al�n ekrana yazd�ral�m.2. cadde bak�rk�y istanbul
		//kullan�c�dan ya��n� alal�m ekrana yazd�ral�m
		//kullan�c�ya t�rkiyede ya��yorum. do�ru yanl��. cevab�n� ekrana yazd�ral�m
		//true veya false olarak
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen ad�n�z� ve soyad�n�z� giriniz");
		String ad�Soyad�=scan.nextLine();
		System.out.println(ad�Soyad�);
		
		System.out.println("L�tfen ya��n�z� yaz�n�z");
		int yas=scan.nextInt();
		System.out.println(yas);
		
		System.out.println("L�tfen adresinizi giriniz");
		String adres=scan.nextLine();
		System.out.println(adres);
		
		System.out.println("T�rkiye'de mi ya��yorsun");
		boolean yer=scan.hasNext();
		System.out.println(yer);
		
		
		
		
		
		
		
		
				
		scan.close();
		
		
		

	}

}
