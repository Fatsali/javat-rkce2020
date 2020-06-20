package day37maps;

import java.util.TreeMap;

public class Map03 {

	public static void main(String[] args) {
		/* TreeMap:1)TreeMap key'lerde null kullanmaya musade etmez ama value'larda istediğimiz kadar null kullanmaya musade eder
		 * 			2)TreeMap elemanlarını console yazdırmak istediğinizde key'ler natural order'a göre sıralanır. 
		 * 			3)TreeMap en yavaşlarıdır.
		   
		 */

		TreeMap<String,Integer>tMap= new TreeMap<>();
		tMap.put("Kanaat", null);
		tMap.put("Bezelye", 7);
		tMap.put("Elma", 10);
		tMap.put("Armut", 8);
		
		System.out.println(tMap);
		
		
		
		
	}

}
