package day35collections;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		//Linked list de head hari� her eleman i�in bir data bir de pointer var. head de sadece pointer var
		//her eleman�n pointer � bir sonraki eleman� g�sterir. son eleman (tail) pointer� null g�sterir
		//data ve pointer iceren her eleman�n diger ad� "Node" dur. 
		//Linked list eleman ekleme ve ��karma durumlar�nda ba�ar�l�d�r. 
		
		
		
		// Linked list objesi olu�turunuz
		LinkedList<String> linkList=new LinkedList<>();
		linkList.add("Mark");
		linkList.add("Amanda");
		linkList.add("John");
		linkList.add("Ann");
		linkList.add("Pamela");
		
		System.out.println(linkList);
		
		linkList.remove(2);//index e g�re eleman siler
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
		
		linkList2.clear();// t�m elemanlar�n� siler. sizde bo� bir list kal�r. 
		System.out.println(linkList2);
		
	}

}
