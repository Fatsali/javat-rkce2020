package day36collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		// Queue eklenen elemanlar en sona eklenir. listlerde olduðu gibi. 
		//Queue silinen elemanlar en baþtan silinir. 
		//[1,2,3] eleman silmeye çalýþtýðýnýzda bu queue de eleman silmeye baþladýðýnýzda önce bir silinir. FÝFO==> First in First Out.
		
		
		// PriorityQueue natural ordera göre sýralar. 
		Queue<String> q=new PriorityQueue<>();
		
		q.add("B");
		q.add("A");
		q.add("C");
		System.out.println(q);
		
		//remove() methodu kullanalým
		System.out.println("Silinen eleman: "+q.remove());
		System.out.println("Kalan queue: "+q);
		System.out.println(q.remove("C"));
		System.out.println(q);
		
		//linkedList elemanlarý sizin girdiðiniz sýraya göre sýralar. 
		Queue<String> qll=new LinkedList<>();
		qll.add("B");
		qll.add("A");
		qll.add("C");
		System.out.println(qll);
		System.out.println("Ýlk elemaný döndürür: "+qll.element());// ilk elemaný döndürür
		System.out.println(qll.poll());// ilk elemaný sildi ve return etti
		
		System.out.println(qll);
		// Not: remove methodu boþ queue lar için kullanýrsa Exception verir
		// poll() methodu boþ queue lar için kullanýlýrsa null verir
		// dolu queue ler için ayný iþi yaparlar. 
	}

}
