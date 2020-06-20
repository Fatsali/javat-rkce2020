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
		
		// list de eleman olarak B var mý? 
		System.out.println(list.contains("B"));// eðer B eleman olarak varsa true yoksa false return eder
		// list de eleman olarak Z var mý? 
		System.out.println(list.contains("Z"));
		
		// listeki elemanlarý alfabetik sýraya koyunuz
		// Collection ==> bir araya getirilmiþ parçalar
		// bir list deki elemanlarý alfabetik sýraya (natural order ) dizmek için 
		// Collections.sort(); methodu kullanýlýr Argument olarak listin adý kullanýlýr. 
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
	}

}
