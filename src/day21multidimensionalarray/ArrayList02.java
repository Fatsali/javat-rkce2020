package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		//list olu�turun ismi list01
		//listler data type olarak primitivleri kabul etmez
		//Primitivlerde data type nun primitiv yapmak i�in wrapper class lar� kullan�r�z.
		
		List<Integer> list01=new ArrayList<>();
		
		// bu listin i�inde eleman olup olmad���n� kontrol ediniz
		//bo� ise true bo� ise false return eder. 
		
		System.out.println(list01.isEmpty());
		
		// bu liste bir eleman ekleyin
		list01.add(123);
		System.out.println(list01);
		System.out.println(list01.isEmpty());
		
		//List den eleman silmek remove() methodu kullan�l�r
		list01.add(124);
		list01.add(125);
		list01.add(124);
		
		System.out.println(list01);
		
		list01.remove(1);// ilk 124 � siler
		System.out.println(list01);
		
		list01.remove(0);
		System.out.println(list01);
		
		list01.remove(list01.size()-1);
		System.out.println(list01);

	}

}
