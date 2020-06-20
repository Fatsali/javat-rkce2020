package day36collections;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		// HashSet 1) tekrarlý eleman kullanýmýna (dublication) izin vermez
		//			2)key value yapýsýný kullanýr. key ler ve value lar hashset için unique dir.
		//normalde keler her zaman unique dir. valuelar kullanýlan classa baðlý olarak unique olabilir veya olmayabilir. kullanýlan
		//class hashset ise value lar da unique olur. ama arraylist ise unique olma zorunluluðu yoktur. 
		
		
		HashSet<String> hSet= new HashSet<>();
		//list lerde add methodu yeni elemaný sona ekler ama hashset lerde böyle bir zorunluluk yok .
		//hashsetler elemanlarý ekrana rast gele yazdýrýr kural yoktur,
		hSet.add("Apple");
		hSet.add("Mango");
		hSet.add("Grape");
		hSet.add("Orange");
		hSet.add("Fig");
		//ayný eleman HashSet eklemek istediðinde cte yada run te alýnmaz. son eklenen eleman ilk eklenen elemanýn üstüne yazýlýr. 
		hSet.add("Apple");
		System.out.println(hSet);
		System.out.println(hSet.hashCode());
		
		
		
		
	}

}
