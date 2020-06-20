package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		//For Each loop for loop  üst versiyonudur. diðer adý "Enhanced(Zenginleþtirilmiþ)
		//For Loop"
		
		int arr[]= {12,21,13,43};
		// for loop kullanarak elemanlarý ekrana yazdýr
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("====");
		for(int w:arr) {
			System.out.println(w);
		}System.out.println();	
		// String içeren bir array oluþturun elemanlarýný yan yana aralarýna boþluk koyarak 
			//for each loop ile yazdýrýn
			
			String arr1[]= {"fatsa","ünye","korgan"};
			for(String w1:arr1) {
				System.out.print(w1+" ");
			}
			
			System.out.println( );
			//integer elemanlar içeren bir list oluþturun for each loop kullanarak bu elemanlarýn 
			//toplamýný yazýnýz
			
		List<Integer> list=new ArrayList<>();
		list.add(11);
		list.add(21);
		list.add(33);
		list.add(23);
		
			int sum=0;
			for(int m:list) {
				sum=sum+m;
			}
			
			System.out.println(sum);
			
			
		
		System.out.println();
		//{{1,2},{5},{6,7,8}} tüm elemanlarý toplayýnýz
		
		int arr2[][]={{1,2},{5},{6,7,8}};
		int sum1=0;
		for(int[]w:arr2) {
			for(int z:w) {
				sum1=sum1+z;
			}
			
		}
		
		System.out.println(sum1);
		
		
		
		
	}

}
