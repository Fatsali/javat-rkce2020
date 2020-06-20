package day16overloading;

public class Overloading01 {

	public static void main(String[] args) {
		// iki say�n�n toplam�n� ekrana yazd�rann bir method olu�turunuz

		
		toplama(2,3);//Method 1
		toplama(7);//Method 2
		toplama(2.3,4);//Method 3
		toplama(5,4.1);//Method 4
	}
	//methodun body k�sm�n� de�istirmek yeterli olmad�
	//overloading yapma yollar�
	//1)Parametrelerin say�s�n� de�i�tirerek ayn� isimli method'lar olu�turabiliriz
	//2)Parametre say�s�n� de�i�tirmeden herhangi bir prametrenin data type nin de�i�tirerek de
	//ayn� isimli methodlar olu�turabiliriz.
	//note: toplama (2,3);�a�r�s� toplama (int num1,int num2)var oldu�u s�rede 
	//toplama (int num1,int num2) yi kullan�r, ��nk� argument data type ile parametre data birebir �rt���yor
	//fakat birebir �t��en data type yoksa auto widwninge g�re java kullanaca�� methodu se�er
	//3) farkli data type indeki parametrelerin yerlerini de�i�tirerek de ayn� isimli methodlar lu�turabilirsiniz
	
	//Method 1
	public static void toplama(int num1,int num2) {
		System.out.println(num1+num2);
	//Method 2	
	}
	public static void toplama(int num1) {
		System.out.println(num1+num1);
	//Method 3	
	}
	public static void toplama(double num1,int num2) {
		System.out.println(num1+num2);
	//Method 4
	}
	public static void toplama(int num1,double num2) {
		System.out.println(num1+num2);
		
	}
}
