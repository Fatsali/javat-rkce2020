package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// Array lerde lengt sabittir deðiþtirilemez 
		//ArrayList lerde length esnektir. siz eleman ekledikce list length ini arttýrýr
		//siz eleman sildikçe list lengthini azaltýr
		
		int arr[]= {1,2,3};
		//List<String>list01=new List<>();==>olmaz
		//ArrayList<String>list01=new List<>();==>olmaz
		//ArrayList<String>list01=new ArrayList<>();==>bu olabilir
		//List<String>list01=new ArrayList<String>();==> bu da olabilir ama aþaðýdaki daha çok kullanýlýr
		
		List<String>list01=new ArrayList<>();
		
		System.out.println(list01);
		
		//listte eleman eklemek için add() methodu kullanýlýr
		
		list01.add("Ali");
		System.out.println(list01);
		
		list01.add("Can");
		System.out.println(list01);// önce ekleneni öne koyar
		
		//veliyi ali ile canýn arasýna ekleyin
		
		list01.add(1, "Veli");
		System.out.println(list01);
		
		//
		
		list01.add(0, "Han");
		System.out.println(list01);
		
		list01.add(2, "Kemal");
		System.out.println(list01);
		
		list01.add(5, "Ayse");
		System.out.println(list01);
		
		//list01 eleman sayýsýný ekrana yazýnýz
		System.out.println("Eleman sayýsý: "+list01.size());
		
		
		
		
	}

}
