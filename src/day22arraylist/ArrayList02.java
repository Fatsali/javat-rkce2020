package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// toArray() methodu manas� listi arraya �evirmek i�in kullan�l�r. 
		
		List<String> list=new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		System.out.println(list);
		// 1. y�ntem methodunu i�nde parametre olarak new String[0] kullan�l�
		String arr[]=list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		
		// 2. y�ntem olu�turdu�umuz array �n data type in� object olarak se�in
		// Object java da b�t�n class lar�n perint�d�r.
		// yani object class ortak atad�r. 
		// object class java da perent� olmayan tek class d�r
		// String Object class �n child oldu�undan data type olarak baz� durumlarda
		// String yerine Object kullan�r�z.
		Object arr1[]=list.toArray();
		System.out.println(Arrays.toString(arr1));
		
		//asList() methodu arayleri liste cevirir
		//asList() methodu parametre olarak array �n ismini kullan�r
		
		String arr2[]= {"Aliye","Canan"};
		
		Arrays.asList(arr2);
		List<String> list1=Arrays.asList(arr2);
		System.out.println(list1);
		
		//Array dan list e cevirme yapt���n�zda elde ettiginiz list uzunluk olarak esnek de�ildir
		// yani array den olu�turdu�umuz list ekleme ve ��karma yapt�ramazs�n�z
		//list1.add("Emine");// add() run time error verir. UnsupportedOperationException
	//	System.out.println(list1);
		
		//list1.remove("Aliye"); yapamazs�n�z
		System.out.println(list1.set(0, "Kemal"));
		
	}

}
