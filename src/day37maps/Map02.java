package day37maps;

import java.util.Hashtable;

public class Map02 {

	public static void main(String[] args) {
		/*HashTable: HashMap ile hemen hemen aynýdýr. 
		 *        Farklarý:
		 * 		1)HashTable key ve value'larda null'a musade etmez
		 * 		2)HashTable thread safe'dir
		 * 		3)HashTable daha yavaþtýr.
		 * 
		 */
	
		Hashtable<String,String>hTable=new Hashtable<>();
		
		hTable.put("Dil", "Kalp");
		hTable.put("Gönül", "Kalp");
		hTable.put("Dil", "Tad alma organý");
		//==>hTable.put(null, "Agýzlýk");//run Time Error verir
		//==>hTable.put("Kanaat", null);//run Time Error verir
		
		//Ayný key deðeri kullanýrsanýz son value yu kabul eder.
		System.out.println(hTable);//{Dil=Tad alma organý, Gönül=Kalp}
		
		//HashMap de kullandýðýnýz methodlarýn tamamý HashTable da da kullanýlýr. 




	}

}
