package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator06 {

	public static void main(String[] args) {
		// kullanýcýdan bir character girmesini isteyiniz
		//Charakter harf ise küçük harf olup olmadýðýný kontrol ediniz
		//küçük harf ise ekrana"Küçük harf" yazdýrýnýz
		//büyük harf ise ekrana "Büyük harf"yazdýrýnýz
		//Harf deðilse ekrana"Harf deðil" yazdýrýnýz
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir karakter giriniz");
		char harf=scan.next().charAt(0);
		String result=((harf<=122&&harf>=97)||(harf<=90&&harf>=65))?((harf<=122&&harf>=97)?"Küçük harf":"Büyük harf"):"Harf degil";
        System.out.println(result);
        scan.close();
	}

}
