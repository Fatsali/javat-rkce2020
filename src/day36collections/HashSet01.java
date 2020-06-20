package day36collections;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		// HashSet 1) tekrarl� eleman kullan�m�na (dublication) izin vermez
		//			2)key value yap�s�n� kullan�r. key ler ve value lar hashset i�in unique dir.
		//normalde keler her zaman unique dir. valuelar kullan�lan classa ba�l� olarak unique olabilir veya olmayabilir. kullan�lan
		//class hashset ise value lar da unique olur. ama arraylist ise unique olma zorunlulu�u yoktur. 
		
		
		HashSet<String> hSet= new HashSet<>();
		//list lerde add methodu yeni eleman� sona ekler ama hashset lerde b�yle bir zorunluluk yok .
		//hashsetler elemanlar� ekrana rast gele yazd�r�r kural yoktur,
		hSet.add("Apple");
		hSet.add("Mango");
		hSet.add("Grape");
		hSet.add("Orange");
		hSet.add("Fig");
		//ayn� eleman HashSet eklemek istedi�inde cte yada run te al�nmaz. son eklenen eleman ilk eklenen eleman�n �st�ne yaz�l�r. 
		hSet.add("Apple");
		System.out.println(hSet);
		System.out.println(hSet.hashCode());
		
		
		
		
	}

}
