package day04Oparators;

import java.util.Scanner;

public class Mudulus03 {

	public static void main(String[] args) {
		
		// kullanýcýdan üç basamaklý bir tam sayý alýn bu sayýnýn rakamlarý toplamýný bulan bir program yazýnýz
		Scanner scan=new Scanner(System.in);
		System.out.println("Üç basamaklý bir sayý giriniz");
		
		int s=scan.nextInt();//123
		int son=s%10;
		
		int v=s/10;
		int ort=v%10;
		
		int ilk=s/100;//üç basamaklý sayýlarýn ilk rakamýný bulmak için sayý 100 e bölünür.
		
		System.out.println(son+ilk+ort);
				
		
		
	scan.close();	
		
	}

}
