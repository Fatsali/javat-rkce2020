package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
		// ternary operator if else if
		//kullanıcıdan bir sayı alınız
		//sayı 0 dan büyük eşit ise 10 dan küçük olup olmadığını kontrol ediniz
		//10 dan küçük ise ekrana rakam yazdırın değilse sayı yazdırın.
		//sayı 0 dan küçük ise ekrana "Negatif sayı yazdırınn"
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int num=scan.nextInt();
		
		String result=num>=0?(num<10?"Rakam":"Pozitif Sayı"):"Negatif sayı";
		System.out.println(result);
		
		scan.close();
	}

}
