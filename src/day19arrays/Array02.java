package day19arrays;

public class Array02 {

	public static void main(String[] args) {
		// 4 elemanl� char bir Array olu�turun bu array e  elemanlar yerle�tirin t�m elemanlar� for 
		//d�ng�s� kullanarak ekrana yaz�n�z. son eleman� ekrana yazd�r�n
		
		char arr1[]=new char[4];
		arr1[0]='a';
		arr1[1]='d';
		arr1[2]='e';
		arr1[3]='m';
		
		for(int i=0;i<4;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("Son de�er: "+(arr1[3]));
		// Array �n length in bulmak i�in Arrayismi.length yazmak yeterlidir
		//Stringlerde length methodu kullan�l�r ama stringlerde kullan�lan length methodu parantezlidir 
		// 
		
		System.out.println(arr1.length);
		
		// Array daki son eleman� yazd�rmak i�in lengtr kullan�l�z
		System.out.println(arr1[arr1.length-1]);
	}
}
