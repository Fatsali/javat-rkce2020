package day37maps;

import java.util.TreeMap;

public class Map03 {

	public static void main(String[] args) {
		/* TreeMap:1)TreeMap key'lerde null kullanmaya musade etmez ama value'larda istedi�imiz kadar null kullanmaya musade eder
		 * 			2)TreeMap elemanlar�n� console yazd�rmak istedi�inizde key'ler natural order'a g�re s�ralan�r. 
		 * 			3)TreeMap en yava�lar�d�r.
		   
		 */

		TreeMap<String,Integer>tMap= new TreeMap<>();
		tMap.put("Kanaat", null);
		tMap.put("Bezelye", 7);
		tMap.put("Elma", 10);
		tMap.put("Armut", 8);
		
		System.out.println(tMap);
		
		
		
		
	}

}
