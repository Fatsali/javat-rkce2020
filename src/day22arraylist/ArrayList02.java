package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// toArray() methodu manasý listi arraya çevirmek için kullanýlýr. 
		
		List<String> list=new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		System.out.println(list);
		// 1. yöntem methodunu içnde parametre olarak new String[0] kullanýlý
		String arr[]=list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		
		// 2. yöntem oluþturduðumuz array ýn data type iný object olarak seçin
		// Object java da bütün class larýn perintýdýr.
		// yani object class ortak atadýr. 
		// object class java da perentý olmayan tek class dýr
		// String Object class ýn child olduðundan data type olarak bazý durumlarda
		// String yerine Object kullanýrýz.
		Object arr1[]=list.toArray();
		System.out.println(Arrays.toString(arr1));
		
		//asList() methodu arayleri liste cevirir
		//asList() methodu parametre olarak array ýn ismini kullanýr
		
		String arr2[]= {"Aliye","Canan"};
		
		Arrays.asList(arr2);
		List<String> list1=Arrays.asList(arr2);
		System.out.println(list1);
		
		//Array dan list e cevirme yaptýðýnýzda elde ettiginiz list uzunluk olarak esnek deðildir
		// yani array den oluþturduðumuz list ekleme ve çýkarma yaptýramazsýnýz
		//list1.add("Emine");// add() run time error verir. UnsupportedOperationException
	//	System.out.println(list1);
		
		//list1.remove("Aliye"); yapamazsýnýz
		System.out.println(list1.set(0, "Kemal"));
		
	}

}
