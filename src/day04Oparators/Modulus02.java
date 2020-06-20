package day04Oparators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
	
		//Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin
		//toplamini veren program yazin
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Lütfen 4 basamaklý bir tam sayý giriniz");
	
	
	//Bir tam sayýnýn birler basamagýný bulmak için sayý 10 a bölünür
	
	int s=scan.nextInt();
	int sonRakam=s%10;
	int ilkRakam=s/1000;
	
	System.out.println(sonRakam+ilkRakam);
	
	
	scan.close();

	}

}
