package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator06 {

	public static void main(String[] args) {
		// kullan�c�dan bir character girmesini isteyiniz
		//Charakter harf ise k���k harf olup olmad���n� kontrol ediniz
		//k���k harf ise ekrana"K���k harf" yazd�r�n�z
		//b�y�k harf ise ekrana "B�y�k harf"yazd�r�n�z
		//Harf de�ilse ekrana"Harf de�il" yazd�r�n�z
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir karakter giriniz");
		char harf=scan.next().charAt(0);
		String result=((harf<=122&&harf>=97)||(harf<=90&&harf>=65))?((harf<=122&&harf>=97)?"K���k harf":"B�y�k harf"):"Harf degil";
        System.out.println(result);
        scan.close();
	}

}
