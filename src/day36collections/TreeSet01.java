package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		// TreeSet: 1) HashSet ile heman hemen ayn�d�r. duplicaiona musaade etmez key value yap�s� kullan�r.
		//          2)TreeSet elemanl�r�n� natural order a g�re dizer. HashSet ise rastgele elemanlar� dizer.
		//			3)hashSet daha h�zl�d�r. 
		//			4)natural order sahip bir set laz�m oldu�unda hashSet olu�turulur elemanlar eklenir
		//			sonra bu HashSet TreeSet e d�n��t�r�l�r b�ylelikle
		// 			TreeSet h�z problemi halledilir. Natural ordera sahip bir set laz�m oldu�unda direkt treeset olu�urma genellikle
		//			kullan�l�lmaz
		
		TreeSet<String>tSet=new TreeSet<>();
		tSet.add("ABC");
		tSet.add("String");
		tSet.add("Test");
		tSet.add("Pen");
		tSet.add("Ink");
		tSet.add("Jack");
		
	System.out.println(tSet);
	
	HashSet<String>hSet1=new HashSet<>();
	hSet1.add("ABC");
	hSet1.add("String");
	hSet1.add("Test");
	hSet1.add("Pen");
	hSet1.add("Ink");
	hSet1.add("Jack");
	
	System.out.println(hSet1);
	
	TreeSet<String>tSet1=new TreeSet<>(hSet1);
	System.out.println(tSet1);
	
	
	
	
	
	
	
	}

}
