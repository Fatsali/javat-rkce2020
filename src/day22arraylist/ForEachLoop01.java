package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		//For Each loop for loop  �st versiyonudur. di�er ad� "Enhanced(Zenginle�tirilmi�)
		//For Loop"
		
		int arr[]= {12,21,13,43};
		// for loop kullanarak elemanlar� ekrana yazd�r
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("====");
		for(int w:arr) {
			System.out.println(w);
		}System.out.println();	
		// String i�eren bir array olu�turun elemanlar�n� yan yana aralar�na bo�luk koyarak 
			//for each loop ile yazd�r�n
			
			String arr1[]= {"fatsa","�nye","korgan"};
			for(String w1:arr1) {
				System.out.print(w1+" ");
			}
			
			System.out.println( );
			//integer elemanlar i�eren bir list olu�turun for each loop kullanarak bu elemanlar�n 
			//toplam�n� yaz�n�z
			
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
		//{{1,2},{5},{6,7,8}} t�m elemanlar� toplay�n�z
		
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
