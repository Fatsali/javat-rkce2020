package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		// kullan�c�dan iki say� al�n�z k���k say�y� ekrana yazd�r�n�z

		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir say� giriniz");
		double num1=scan.nextDouble();
		System.out.println("L�tfen bir say� daha giriniz");
		double num2=scan.nextDouble();
		
		double sonuc1=(num1<num2) ? num1:num2;
				System.out.println(sonuc1);
		double sonuc2=(num2<num1)?num2:num1;
		System.out.println("sonuc2");
		
		//double sonuc=num1>=num2?num2:num1
		scan.close();
	}

}
