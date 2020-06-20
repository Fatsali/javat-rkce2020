package day02wrepperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		//kullanýcý iki tam sayý versin
		//program bu tam sayýlarýn toplamaýný ve çarpýmýný ekrana yazdýrsýn.
		
		Scanner scan=new Scanner(System.in);//Scanner classini import ettik.
		
		System.out.println("Lütfen iki tamsayý giriniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		
		System.out.println(sayi1+sayi2);
		System.out.println(sayi1*sayi2);
		
		
		//kullanýcý karenin bir kenar uzunluðunu giriniz
		//karenin çevresini ve alanýný 
		
		
		
		
		scan.close();
		
		
	}

}
