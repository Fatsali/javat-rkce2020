package day11StringMethod;

public class StringMethod02 {

	public static void main(String[] args) {
		// substring() methodu bir stringin belli bir b�l�m�n� kesip almak i�in kullan�l�r
		String str1="Java cal�sana kolayd�r";
		//substring()1.versiyon
		System.out.println(str1.substring(5));//5 indexi g�sterir.
		System.out.println(str1.substring(8));//index 8 dahildir(inclusive)
		System.out.println(str1.substring(22));//ekranda hi�bir�ey g�remezsiniz
		//System.out.println(str1.substring(23));//index 23 yok ama ben olmayan bir yerden kesmek istiyorum
		                                       // bu bir hatal� index tir. Java Exception verir. Yani beni uyar�r.hata yap�yorsun der
		System.out.println(str1.substring(0));//str1.substring(0)=str1 hi� kullan�lmaz
		//substring()2.versiyon
		System.out.println(str1.substring(5, 13));//ilk index dahil ikinci index dahil de�il.
											//ilk index i ekranda g�r�rs�n�z ikinci index ekranda g�remezsiniz.
											//ekranda �al��ana g�rmeliyim
		System.out.println(str1.substring(6, 12));
		System.out.println(str1.substring(6, 6));//ekranda hi�bir�ey vermez bu kullan�lmaz
		//System.out.println(str1.substring(7, 6));//Exception verir. bu hatay� yapmay�n. her zaman ilk index k���k veya e�it olmal�d�r.
		
		//	
		

	}

}
