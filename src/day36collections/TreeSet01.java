package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		// TreeSet: 1) HashSet ile heman hemen aynýdýr. duplicaiona musaade etmez key value yapýsý kullanýr.
		//          2)TreeSet elemanlýrýný natural order a göre dizer. HashSet ise rastgele elemanlarý dizer.
		//			3)hashSet daha hýzlýdýr. 
		//			4)natural order sahip bir set lazým olduðunda hashSet oluþturulur elemanlar eklenir
		//			sonra bu HashSet TreeSet e dönüþtürülür böylelikle
		// 			TreeSet hýz problemi halledilir. Natural ordera sahip bir set lazým olduðunda direkt treeset oluþurma genellikle
		//			kullanýlýlmaz
		
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
