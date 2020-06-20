package day37maps;

import java.util.Hashtable;

public class Map02 {

	public static void main(String[] args) {
		/*HashTable: HashMap ile hemen hemen ayn�d�r. 
		 *        Farklar�:
		 * 		1)HashTable key ve value'larda null'a musade etmez
		 * 		2)HashTable thread safe'dir
		 * 		3)HashTable daha yava�t�r.
		 * 
		 */
	
		Hashtable<String,String>hTable=new Hashtable<>();
		
		hTable.put("Dil", "Kalp");
		hTable.put("G�n�l", "Kalp");
		hTable.put("Dil", "Tad alma organ�");
		//==>hTable.put(null, "Ag�zl�k");//run Time Error verir
		//==>hTable.put("Kanaat", null);//run Time Error verir
		
		//Ayn� key de�eri kullan�rsan�z son value yu kabul eder.
		System.out.println(hTable);//{Dil=Tad alma organ�, G�n�l=Kalp}
		
		//HashMap de kulland���n�z methodlar�n tamam� HashTable da da kullan�l�r. 




	}

}
