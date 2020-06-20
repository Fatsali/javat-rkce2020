package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// Arrays: tepsi demektir.
		// birden fazla varriable�i ayn� anda kullanmak istedi�imiz zaman arrays kullan�yoruz.
		// Array�ler object�tir.
		// Primitiveleri Java olu�turur. non primitive lardan ise istedi�imiz kadar �retebiliriz.
		// bu non primitivelerden biriside arraysdir.
		// Arraysler hipte depolan�r.
		// hip b�y�k bir alan oldu�u i�in bulunabilmesi i�in adreslenmesi gerekir.
		// Arrays i�inde t�m variable�lar ayn� data type��nde olmal�d�r.
		// arrays sadece Primitive type (byte, short...8 tane) ve objeckt referans konulabilir.
		// arrays��n i�inde Stringin adresi olur, kendisi olmaz.
		// array�in i�ine stackdekiler konulabilir.
		// Bir array olu�turmadan �nce o Array�in i�ine ka� variable koyaca��m�za karar vermeliyiz.
		// Bir Array i�ine koyabilece�imiz variable say�s�na o Array�in �length�i denir.
		// bir Array�in length=2 gibi
		// O Array i�ine length�den fazla variable koyamay�z.
		
		
		// �nteger Array olu�tural�m
		
		int arr1[]=new int[5];
		
		//System.out.println(arr1);Array �n reference ni ekrana yazd�r�
		//System.out.println(arr1[3]);Array �n �ndex i 3 olan eleman� ekrana yazd�r�r
		System.out.println(arr1[0]);
		System.out.println(arr1[3]);
		arr1[0]=12;
		System.out.println(arr1[0]);
		arr1[1]=13;
		System.out.println(arr1[1]);
		arr1[2]=14;
		System.out.println(arr1[2]);
		arr1[3]=15;
		System.out.println(arr1[3]);
		arr1[4]=22;
		System.out.println(arr1[4]);
		
		// Array daki elemanlar� ekrana yazd�rmak i�in for d�ng�s� yap�n�z
		for(int i =0;i<5;i++) {
			System.out.println(arr1[i]);
		}
			//Array da olmayan index de�er atamas� yap�l�rsa run time error verir
			//Array da olmayan index kullanmaya �al���rsak "ArrayIndexOutOfBoundsException" al�r�z
		//arr1[5]=23;
		//System.out.println(arr1[5]);
	}

}
