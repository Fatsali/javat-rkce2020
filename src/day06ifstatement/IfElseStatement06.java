package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement06 {

	public static void main(String[] args) {
		// Kullan�c�dan s�nav notunu tam say� olarak girmesini isteyin 
		//negatif girerse yanl�� deger girdiniz ekrana yazd�r�n
		//50 den k���k girerse ekrana kald�n�z yazd�r�n
		//80 den k���k ise ge�tiniz yazd�r�n
		//100 den k���k ise ekrana tebrikler yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen s�nav notunuzu tam say� olarak giriniz");
		int not=scan.nextInt();
		
		if(not<0) {
			System.out.println("Yanl�� deger girdiniz");
		}
		else if(not<50) {
			System.out.println("Kald�n�z");
		}
		else if(not<80) {
			System.out.println("Gectiniz");
		}
		else if(not<=100){
			System.out.println("Tebrikler");
		}
		else {
			System.out.println("100 den b�y�k deger giremezsiniz");
		}
		
	
		
		
		
		
		scan.close();

	}

}
