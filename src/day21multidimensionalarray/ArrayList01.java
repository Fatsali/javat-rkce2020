package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// Array lerde lengt sabittir de�i�tirilemez 
		//ArrayList lerde length esnektir. siz eleman ekledikce list length ini artt�r�r
		//siz eleman sildik�e list lengthini azalt�r
		
		int arr[]= {1,2,3};
		//List<String>list01=new List<>();==>olmaz
		//ArrayList<String>list01=new List<>();==>olmaz
		//ArrayList<String>list01=new ArrayList<>();==>bu olabilir
		//List<String>list01=new ArrayList<String>();==> bu da olabilir ama a�a��daki daha �ok kullan�l�r
		
		List<String>list01=new ArrayList<>();
		
		System.out.println(list01);
		
		//listte eleman eklemek i�in add() methodu kullan�l�r
		
		list01.add("Ali");
		System.out.println(list01);
		
		list01.add("Can");
		System.out.println(list01);// �nce ekleneni �ne koyar
		
		//veliyi ali ile can�n aras�na ekleyin
		
		list01.add(1, "Veli");
		System.out.println(list01);
		
		//
		
		list01.add(0, "Han");
		System.out.println(list01);
		
		list01.add(2, "Kemal");
		System.out.println(list01);
		
		list01.add(5, "Ayse");
		System.out.println(list01);
		
		//list01 eleman say�s�n� ekrana yaz�n�z
		System.out.println("Eleman say�s�: "+list01.size());
		
		
		
		
	}

}
