package day35collections;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		//Linked list de head hariç her eleman için bir data bir de pointer var. head de sadece pointer var
		//her elemanýn pointer ý bir sonraki elemaný gösterir. son eleman (tail) pointerý null gösterir
		//data ve pointer iceren her elemanýn diger adý "Node" dur. 
		//Linked list eleman ekleme ve çýkarma durumlarýnda baþarýlýdýr. 
		
		
		
		// Linked list objesi oluþturunuz
		LinkedList<String> linkList=new LinkedList<>();
		linkList.add("Mark");
		linkList.add("Amanda");
		linkList.add("John");
		linkList.add("Ann");
		linkList.add("Pamela");
		
		System.out.println(linkList);
		
		linkList.remove(2);//index e göre eleman siler
		System.out.println(linkList);
		
		linkList.removeFirst();
		System.out.println(linkList);
		
		linkList.removeLast();
		System.out.println(linkList);
		
		linkList.add(1, "Ali");;
		System.out.println(linkList);
		
		linkList.addFirst("Kemal");;
		System.out.println(linkList);
		
		linkList.addLast("Zeynep");;
		System.out.println(linkList);
		
		linkList.set(1, "Ajanda");
		System.out.println(linkList);
		
		LinkedList<String> linkList2=new LinkedList<>();
		linkList2.add("X");
		linkList2.add("Y");
		
		linkList2.addAll(linkList);
		System.out.println(linkList2);
		
		linkList.addAll(3, linkList2);
		System.out.println(linkList);
		
		System.out.println(linkList2.contains("Can"));
		System.out.println(linkList2.contains("Ali"));
		
		linkList2.clear();// tüm elemanlarýný siler. sizde boþ bir list kalýr. 
		System.out.println(linkList2);
		
	}

}
