package day02wrepperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		//kulan�c�dan al�nan bir say�n�n k�p�n� hesaplayan bir program ya
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen karenin bir kenar uzunlu�unu yaz�n�z");
		
		int sayi1=scan.nextInt();
		
		System.out.println(sayi1*sayi1*sayi1);
		
		scan.close();
		

	}

}
