package day09switchoperator;

import java.util.Scanner;

public class Art�kyilTernaryInterviw {

	public static void main(String[] args) {
		// Kullan�c�dan bir y�l girmesini isteyin,
				//y�l art�k y�l ise ekrana �Art�k y�l� 
				//degilse ekrana �Art�k y�l degil� yazd�r�n.
				
				Scanner scan=new Scanner(System.in);
				System.out.println("L�tfen bir y�l giriniz");
				int yil=scan.nextInt();
				
				String result=yil>0?(yil%100==0?(yil%400==0?"Art�k y�l":"Art�k y�l de�il"):(yil%4==0?"Art�k y�l":"Art�k y�l de�il")):"L�tfen do�ru bir y�l giriniz";
				System.out.println(result);
				
				scan.close();
				

	}

}
