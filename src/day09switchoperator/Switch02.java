package day09switchoperator;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		// kullan�c�ya haftan�n g�n numaras�n� girsin
		//program�n�z g�n�n ismini yazs�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen haftan�n bir g�n numaras�n� giriniz");
		int g�n=scan.nextInt();
		
		switch(g�n) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sal�");
			break;
		case 3:
			System.out.println("�ar�amba");
			break;
		case 4:
			System.out.println("Per�embe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Yanl�� bir de�er girdiniz");
			
		}
		
		scan.close();
		

	}

}
