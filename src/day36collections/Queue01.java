package day36collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		// Queue eklenen elemanlar en sona eklenir. listlerde oldu�u gibi. 
		//Queue silinen elemanlar en ba�tan silinir. 
		//[1,2,3] eleman silmeye �al��t���n�zda bu queue de eleman silmeye ba�lad���n�zda �nce bir silinir. F�FO==> First in First Out.
		
		
		// PriorityQueue natural ordera g�re s�ralar. 
		Queue<String> q=new PriorityQueue<>();
		
		q.add("B");
		q.add("A");
		q.add("C");
		System.out.println(q);
		
		//remove() methodu kullanal�m
		System.out.println("Silinen eleman: "+q.remove());
		System.out.println("Kalan queue: "+q);
		System.out.println(q.remove("C"));
		System.out.println(q);
		
		//linkedList elemanlar� sizin girdi�iniz s�raya g�re s�ralar. 
		Queue<String> qll=new LinkedList<>();
		qll.add("B");
		qll.add("A");
		qll.add("C");
		System.out.println(qll);
		System.out.println("�lk eleman� d�nd�r�r: "+qll.element());// ilk eleman� d�nd�r�r
		System.out.println(qll.poll());// ilk eleman� sildi ve return etti
		
		System.out.println(qll);
		// Not: remove methodu bo� queue lar i�in kullan�rsa Exception verir
		// poll() methodu bo� queue lar i�in kullan�l�rsa null verir
		// dolu queue ler i�in ayn� i�i yaparlar. 
	}

}
