package day02wrepperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		//kulanýcýdan alýnan bir sayýnýn küpünü hesaplayan bir program ya
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen karenin bir kenar uzunluðunu yazýnýz");
		
		int sayi1=scan.nextInt();
		
		System.out.println(sayi1*sayi1*sayi1);
		
		scan.close();
		

	}

}
