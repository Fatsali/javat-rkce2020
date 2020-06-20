package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview01 {

	public static void main(String[] args) {
		// kullanýcýdan bir String alýn ve ekrana tersten yazdýrýn
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir cümle veya kelime yazýnýz");
		String str=scan.nextLine();
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));//naC ilA
		}
		
		
		

	}

}
