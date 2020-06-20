package day20arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		//bir arrayýn içinde belli bir elemanýn var olup olmadýðýn kontrol ediniz
		//binarySearch() methodu bu iþ için kullanýlýr
		//binarySearch() methodu aranan eleman varsa o elemanýn index return eder
		//Önemli Not: binarySearch methodunu kullanmadan önce sort() methodunu kullanmak sorundasýnýz
		// aksi takdirde manalý bir sonuç vermez
		
		int arr[]= {1,12,12,2,3};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr,3));
		System.out.println(Arrays.binarySearch(arr,12));
		//ayný elemanda birden fazla olduðunda ilkini verir.
		//olmayan elemanlar için negatif sayýlar return eder.
		//negatif olmasý o elemanýn erray da olmadýðý anlamýna gelir. 
		//sayý kýsmý ise o eleman var olsaydý kaçýncý eleman olurdu anlamýndadýr.
		System.out.println(Arrays.binarySearch(arr,5));//-4 verir. çünkü 5 var olsaydý index i 4 olacaktý
		
		
	}

}
