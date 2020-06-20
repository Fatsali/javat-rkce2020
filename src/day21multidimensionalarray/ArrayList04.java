package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		//
		
		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		// list de eleman olarak B var m�? 
		System.out.println(list.contains("B"));// e�er B eleman olarak varsa true yoksa false return eder
		// list de eleman olarak Z var m�? 
		System.out.println(list.contains("Z"));
		
		// listeki elemanlar� alfabetik s�raya koyunuz
		// Collection ==> bir araya getirilmi� par�alar
		// bir list deki elemanlar� alfabetik s�raya (natural order ) dizmek i�in 
		// Collections.sort(); methodu kullan�l�r Argument olarak listin ad� kullan�l�r. 
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
	}

}
