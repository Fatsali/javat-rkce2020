package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview03 {

	public static void main(String[] args) {
		// kullanýcýdan bir sayý alýn bu sayýnýn tersini ekrana yazdýrýnýz
		//bu sayýnýn tersinin iki fazlasýný yazdýrýnýz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz");
		String num=scan.nextLine();
		 
		String ters="";
		for(int i=num.length()-1;i>=0;i--) {
			ters=ters+num.charAt(i)+"";//char ý Stringe çevirmek için sonuna +"" ekleyebilirsiniz.
		}//System.out.println(ters);
		
		int tersInt=Integer.valueOf(ters);
		tersInt=tersInt+2;
		
		System.out.println(tersInt);
		
		}
		
	}


