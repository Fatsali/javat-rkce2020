package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		//Kullan�c�dan bir say� al�n�z
		// say� pozitifse ekrana"Pozitif" yazd�r�n
		// say� negatif ise ekrana "Negatif" yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
        double num = scan.nextDouble();
        
       // if(num>=0) {
        //    System.out.println("Pozitif veya 0");
      //  }else{
      //      System.out.println("Negatif");
			
		//ternary Oparator
            //           soru i�areti
        String sonu�=    (num>=0)       ?          "Pozitif veya 0"   :   "Negatif";
		System.out.println(sonu�);
		
		scan.close();

	}

}
