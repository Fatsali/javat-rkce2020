package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOparator07 {

	public static void main(String[] args) {
		// Kullan�c�dan bir say� al�n�z.
		//say� �ift ise 10 a b�l�n�p b�l�nmedi�ini kontrol ediniz.
		//10 a b�l�n�yorsa "Woow"
        //10 a b�l�nm�yorsu "Yaz�k"
		//say� tek ise 5 e b�l�n�p b�l�nmedi�in kontrol ediniz
		//say� 5 e b�l�n�yorsa "wooow 5"
		//say� 5 e b�l�nm�yorsa "Yaz�k 5" yazd�r�n�z
		
		Scanner scan=new Scanner (System.in);
		System.out.println("L�tfen bir say� giriniz");
		int num=scan.nextInt();
				
		String result=num%2==0?(num%10==0?"Wooow 10":"Yaz�k 10"):(num%5==0?"Wooow 5":"Yaz�k 5");
		System.out.println(result);
		
		scan.close();
		
	}

}
