package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
		// ternary operator if else if
		//kullan�c�dan bir say� al�n�z
		//say� 0 dan b�y�k e�it ise 10 dan k���k olup olmad���n� kontrol ediniz
		//10 dan k���k ise ekrana rakam yazd�r�n de�ilse say� yazd�r�n.
		//say� 0 dan k���k ise ekrana "Negatif say� yazd�r�nn"
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir say� giriniz");
		int num=scan.nextInt();
		
		String result=num>=0?(num<10?"Rakam":"Pozitif Say�"):"Negatif say�";
		System.out.println(result);
		
		scan.close();
	}

}
