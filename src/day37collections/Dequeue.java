package day37collections;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {

	public static void main(String[] args) {
		// Deque: Double queue (iki uçlu Queue)
		//Queue larda ekleme sona yapýlýr, silme bastan yapýlýr. 
		//Deque kullanýrsanýz eklemeyi hem baþa hem de sona yapabilirsiniz ayný þekilde hem baþtan hem de sondan yapabilirsiniz.
		//Deque da FÝFO var bunu yanýnda LIFO(Last in First Out)da var.
		
		//Queue lara eleman olarak null eklenebilir. ama Deque lara null eleman olarak eklenemez
		
		
		Deque<String>dq=new LinkedList<String>();
		
		dq.add("Son1");
		dq.addFirst("Bas1");
		dq.addLast("Son2");
		dq.push("Bas2");
		dq.offer("Son3");
		dq.offerFirst("Bas3");
		dq.offerLast("Son4");
		System.out.println(dq);
		
		//pop() methodu Deqularda baþtaki elemaný siler ve bastaki elemaný return eder.
		System.out.println(dq.pop());
		System.out.println(dq);
		
		System.out.println(dq.removeLast());
		System.out.println(dq);
		
		System.out.println(dq.removeFirst());
		System.out.println(dq);
		
	}

}
