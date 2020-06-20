package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		//Kullanýcýdan bir sayý alýnýz
		// sayý pozitifse ekrana"Pozitif" yazdýrýn
		// sayý negatif ise ekrana "Negatif" yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
        double num = scan.nextDouble();
        
       // if(num>=0) {
        //    System.out.println("Pozitif veya 0");
      //  }else{
      //      System.out.println("Negatif");
			
		//ternary Oparator
            //           soru iþareti
        String sonuç=    (num>=0)       ?          "Pozitif veya 0"   :   "Negatif";
		System.out.println(sonuç);
		
		scan.close();

	}

}
