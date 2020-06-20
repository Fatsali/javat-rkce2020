package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// Bir integer array �n elemanlar�n� k���kten b�y�ge diziniz 
		//ve ekrana iki durumu da yazd�r�n�z
		
		int arr[]= {2,11,0,23,7};
		System.out.println("S�ralamadan �nce: "+Arrays.toString(arr));
		// Arrays.sort() methodu array�n ismi yaz�l�rsa o array�n elemanlar�n� k���kten 
		//b�y��e (ascending order,natural order)do�ru s�ralar
		Arrays.sort(arr);
		System.out.println("S�ralamadan sonra: "+Arrays.toString(arr));
		
		
		//charlardan olu�an bir array olu�turunuz olu�turunuz ve ascending order yap�n�z
		//charlar s�ralan�rken java asc�� kodlar� kullan�r b�y�k harflerin Asc�� kodlar� k���k
		//harflerden azd�r o y�zden b�y�k harfler �nce ge�er
		//java rakamlar�n Asc�� kodu o rakam�n de�eri gibi d���n�r.
		
		char arrch[]= {'d','l','a','f'};
		System.out.println("S�ralamadan �nce: "+Arrays.toString(arrch));
		Arrays.parallelSort(arrch);
		System.out.println("S�ralamadan sonra: "+Arrays.toString(arrch));
		
		//stringlerden olu�an bir array olu�turun ve ascending order yap�n
		
		String arrstr[]= {"ordu","fatsa","�nye","korgan"};
		System.out.println("S�ralamadan �nce: "+Arrays.toString(arrstr));
		Arrays.parallelSort(arrstr);
		System.out.println("S�ralamadan sonra: "+Arrays.toString(arrstr));
		
		//boolean bir array olu�turun ascendin orde yap�n
		
		boolean arrbl[]= {true,false,false};
		System.out.println("S�ralamadan �nce: "+Arrays.toString(arrbl));
		//boolean i�in sort methodu kullan�lamaz
		
		
	}

}
