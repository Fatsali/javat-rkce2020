package day36collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSet01 {

	public static void main(String[] args) {
		// LinkedHashSet: 1) Duplication a izin vermez key value yap�s� var
		//				  2)elemanlar� programc�n�n girdi�i s�raya g�re dizer. 
		
		
		LinkedHashSet<String> lhSet=new LinkedHashSet<>();
		lhSet.add("Z");
		lhSet.add("A");
		lhSet.add("D");
		lhSet.add("B");
		System.out.println(lhSet);
		
		LinkedHashSet<String> lhSet1=new LinkedHashSet<>();
		lhSet1.add("3");
		lhSet1.add("1");
		lhSet1.add("5");
		lhSet1.add("0");
		System.out.println(lhSet1);
		
		
//		TreeSet<Integer>tSet=new TreeSet<>(lhSet1);
//		System.out.println(tSet);
//		
	}
		
	}


