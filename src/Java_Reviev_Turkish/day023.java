package Java_Reviev_Turkish;

import java.util.Scanner;

public class day023 {

	public static void main(String[] args) {
		// // Kullan�c�dan bir say� girmesini isteyiniz
		// Say� tek say� ise "Say�n�z tek say�d�r."
		// Say� �ift say� ise "Say�n�z �ift say�d�r." yazd�r�n�z	
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir tam say� girininiz");
		int num=scan.nextInt();
		if(num%2==0) {
			System.out.println("Say�n�z �ift say�d�r");
		}else {
			System.out.println("Say�n�z tek say�d�r.");
			scan.close();
		}
	}

}
