package day09switchoperator;

import java.util.Scanner;

public class ArtýkyilTernaryInterviw {

	public static void main(String[] args) {
		// Kullanýcýdan bir yýl girmesini isteyin,
				//yýl artýk yýl ise ekrana “Artýk yýl” 
				//degilse ekrana “Artýk yýl degil” yazdýrýn.
				
				Scanner scan=new Scanner(System.in);
				System.out.println("Lütfen bir yýl giriniz");
				int yil=scan.nextInt();
				
				String result=yil>0?(yil%100==0?(yil%400==0?"Artýk yýl":"Artýk yýl deðil"):(yil%4==0?"Artýk yýl":"Artýk yýl deðil")):"Lütfen doðru bir yýl giriniz";
				System.out.println(result);
				
				scan.close();
				

	}

}
