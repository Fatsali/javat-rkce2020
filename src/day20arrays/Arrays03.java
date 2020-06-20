package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// iki array olu�turup bu arraylerin bir birine e�it olup olmad���n� kontrol ediniz
		// not:iki array �n e�it olabilmesi i�in 
		//1) elemanlar ayn� olmal� 2) e�it elemanlar�n indexleri de e�it olmal�.
		
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		
		System.out.println(arr1==arr2);// false ��nk� referance ler farkl�."==" adresleri de kontrol
		                           // eder. iki array farkl� iki object oldu�undan adresleri farkl�d�r
		System.out.println(Arrays.equals(arr1, arr2));//true verir ��nk� Arrays.equals methodu sadece
		                           //de�erleri ve indexleri kontrol eder reference lere bakmazlar.
		
		
		
		
		
	}

}
