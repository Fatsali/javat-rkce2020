package day02wrepperclasses;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		
		/*�nan bir dairenin �evresini ve alan�n� hesaplayan 
		bir program yaz�n�z. (float kullan�n�z)
		Not 1: pi say�s�: 3.14159
		Not 2: Alan: 3.14159 x radius x radius
		Not 3: Cevre: 2 x 3.14159 x radius */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen yar� capi giriniz");
		
		double yaricap=scan.nextDouble();//data tipi int ise next in kullan�l�r
				                        //data tibi Double ise next Double kullan�l�r
		
		System.out.println(3.14159*yaricap*yaricap);
		System.out.println(2*3.14159*yaricap);
		
scan.close();
	}

	
}
