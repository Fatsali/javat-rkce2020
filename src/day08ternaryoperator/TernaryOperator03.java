package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		// kullanýcýdan iki sayý alýnýz küçük sayýyý ekrana yazdýrýnýz

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz");
		double num1=scan.nextDouble();
		System.out.println("Lütfen bir sayý daha giriniz");
		double num2=scan.nextDouble();
		
		double sonuc1=(num1<num2) ? num1:num2;
				System.out.println(sonuc1);
		double sonuc2=(num2<num1)?num2:num1;
		System.out.println("sonuc2");
		
		//double sonuc=num1>=num2?num2:num1
		scan.close();
	}

}
