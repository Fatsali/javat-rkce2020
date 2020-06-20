package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		// 

		List<String> list=new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Ali");
		
		System.out.println(list);
		
		list.remove("Ali");
		System.out.println(list);
		list.remove("Ali");// bir den fazla eleman varsa ilkini siler
		System.out.println(list);
		list.remove("Kemal");// remove methodu listede olmayan elemanlar için hata vermez.
		System.out.println(list);
		System.out.println(list.remove(0));
		System.out.println(list);
		
		//"Ayse" elemaný "Güzel Ayse "  set () methodu
		
		
		System.out.println(list.set(0, "Aysegul"));
		System.out.println(list);
		
		//liste "kenan" "zeynep"
		
		list.add("Kenan");
		list.add("Zeynep");
		System.out.println(list);
		
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list);
		
		
	}

}
