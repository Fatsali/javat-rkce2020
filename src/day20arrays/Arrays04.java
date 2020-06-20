package day20arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		//bir array�n i�inde belli bir eleman�n var olup olmad���n kontrol ediniz
		//binarySearch() methodu bu i� i�in kullan�l�r
		//binarySearch() methodu aranan eleman varsa o eleman�n index return eder
		//�nemli Not: binarySearch methodunu kullanmadan �nce sort() methodunu kullanmak sorundas�n�z
		// aksi takdirde manal� bir sonu� vermez
		
		int arr[]= {1,12,12,2,3};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr,3));
		System.out.println(Arrays.binarySearch(arr,12));
		//ayn� elemanda birden fazla oldu�unda ilkini verir.
		//olmayan elemanlar i�in negatif say�lar return eder.
		//negatif olmas� o eleman�n erray da olmad��� anlam�na gelir. 
		//say� k�sm� ise o eleman var olsayd� ka��nc� eleman olurdu anlam�ndad�r.
		System.out.println(Arrays.binarySearch(arr,5));//-4 verir. ��nk� 5 var olsayd� index i 4 olacakt�
		
		
	}

}
