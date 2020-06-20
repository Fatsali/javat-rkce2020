package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// iki array oluþturup bu arraylerin bir birine eþit olup olmadýðýný kontrol ediniz
		// not:iki array ýn eþit olabilmesi için 
		//1) elemanlar ayný olmalý 2) eþit elemanlarýn indexleri de eþit olmalý.
		
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		
		System.out.println(arr1==arr2);// false çünkü referance ler farklý."==" adresleri de kontrol
		                           // eder. iki array farklý iki object olduðundan adresleri farklýdýr
		System.out.println(Arrays.equals(arr1, arr2));//true verir çünkü Arrays.equals methodu sadece
		                           //deðerleri ve indexleri kontrol eder reference lere bakmazlar.
		
		
		
		
		
	}

}
