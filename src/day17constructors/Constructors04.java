package day17constructors;

public class Constructors04 {

	int num1=12;
	static int num2=22;
	
	public static void main(String[] args) {
		// static methodlar�n i�inde sadece static elemanlar kullan�labilir.
		//num1 static olmad���ndan main method i�inde kullan�lamaz.
		//num2 static oldu�undan main methodun i�inde kullanmam�z problm olmuyor
		//num1++;// num1++; n�n �n�ndeki commenti kald�r�rsan�n java num1++ n�n alt�n� kurm�z� �izer.
		num2++;
	}

}
